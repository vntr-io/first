package io.vntr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vntr.bean.Users;
import io.vntr.json.UsersJson;
import io.vntr.service.UsersService;
import io.vntr.mapper.UsersBeanJsonMapper;

@RestController
public class UsersRestController
{
    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersBeanJsonMapper usersBeanJsonMapper;

    @RequestMapping( value="/users", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public UsersJson create(@RequestBody UsersJson users)
    {
		Users convertedBean = usersBeanJsonMapper.mapJsonToBean(users);
		Users createdBean = usersService.create(convertedBean);
        return usersBeanJsonMapper.mapBeanToJson(createdBean);
    }

    @RequestMapping( value="/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UsersJson read(@PathVariable("id") Integer id)
    {
    	Users retrievedBean = usersService.findById(id);
        return usersBeanJsonMapper.mapBeanToJson(retrievedBean);
    }

    @RequestMapping( value="/users/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public UsersJson update(@PathVariable("id") Integer id, @RequestBody UsersJson users)
    {
		Users convertedBean = usersBeanJsonMapper.mapJsonToBean(users);
		Users updatedBean = usersService.update(convertedBean);
        return usersBeanJsonMapper.mapBeanToJson(updatedBean);
    }

    @RequestMapping( value="/users/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") Integer id)
    {
        usersService.delete(id);
    }
}