package io.vntr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vntr.bean.Groups;
import io.vntr.json.GroupsJson;
import io.vntr.service.GroupsService;
import io.vntr.mapper.GroupsBeanJsonMapper;

@RestController
public class GroupsRestController
{
    @Autowired
    private GroupsService groupsService;

    @Autowired
    private GroupsBeanJsonMapper groupsBeanJsonMapper;

    @RequestMapping( value="/groups", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GroupsJson create(@RequestBody GroupsJson groups)
    {
		Groups convertedBean = groupsBeanJsonMapper.mapJsonToBean(groups);
		Groups createdBean = groupsService.create(convertedBean);
        return groupsBeanJsonMapper.mapBeanToJson(createdBean);
    }

    @RequestMapping( value="/groups/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GroupsJson read(@PathVariable("id") Integer id)
    {
    	Groups retrievedBean = groupsService.findById(id);
        return groupsBeanJsonMapper.mapBeanToJson(retrievedBean);
    }

    @RequestMapping( value="/groups/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GroupsJson update(@PathVariable("id") Integer id, @RequestBody GroupsJson groups)
    {
		Groups convertedBean = groupsBeanJsonMapper.mapJsonToBean(groups);
		Groups updatedBean = groupsService.update(convertedBean);
        return groupsBeanJsonMapper.mapBeanToJson(updatedBean);
    }

    @RequestMapping( value="/groups/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") Integer id)
    {
        groupsService.delete(id);
    }
}