package io.vntr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vntr.bean.Friendships;
import io.vntr.json.FriendshipsJson;
import io.vntr.service.FriendshipsService;
import io.vntr.mapper.FriendshipsBeanJsonMapper;

@RestController
public class FriendshipsRestController
{
    @Autowired
    private FriendshipsService friendshipsService;

    @Autowired
    private FriendshipsBeanJsonMapper friendshipsBeanJsonMapper;

    @RequestMapping( value="/friendships", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public FriendshipsJson create(@RequestBody FriendshipsJson friendships)
    {
		Friendships convertedBean = friendshipsBeanJsonMapper.mapJsonToBean(friendships);
		Friendships createdBean = friendshipsService.create(convertedBean);
        return friendshipsBeanJsonMapper.mapBeanToJson(createdBean);
    }

    @RequestMapping( value="/friendships/{userId1}/{userId2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public FriendshipsJson read(@PathVariable("userId1") Integer userId1, @PathVariable("userId2") Integer userId2)
    {
    	Friendships retrievedBean = friendshipsService.findById(userId1, userId2);
        return friendshipsBeanJsonMapper.mapBeanToJson(retrievedBean);
    }

    @RequestMapping( value="/friendships/{userId1}/{userId2}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public FriendshipsJson update(@PathVariable("userId1") Integer userId1, @PathVariable("userId2") Integer userId2, @RequestBody FriendshipsJson friendships)
    {
		Friendships convertedBean = friendshipsBeanJsonMapper.mapJsonToBean(friendships);
		Friendships updatedBean = friendshipsService.update(convertedBean);
        return friendshipsBeanJsonMapper.mapBeanToJson(updatedBean);
    }

    @RequestMapping( value="/friendships/{userId1}/{userId2}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("userId1") Integer userId1, @PathVariable("userId2") Integer userId2)
    {
        friendshipsService.delete(userId1, userId2);
    }
}