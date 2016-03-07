package io.vntr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vntr.bean.Memberships;
import io.vntr.json.MembershipsJson;
import io.vntr.service.MembershipsService;
import io.vntr.mapper.MembershipsBeanJsonMapper;

@RestController
public class MembershipsRestController
{
    @Autowired
    private MembershipsService membershipsService;

    @Autowired
    private MembershipsBeanJsonMapper membershipsBeanJsonMapper;

    @RequestMapping( value="/memberships", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MembershipsJson create(@RequestBody MembershipsJson memberships)
    {
		Memberships convertedBean = membershipsBeanJsonMapper.mapJsonToBean(memberships);
		Memberships createdBean = membershipsService.create(convertedBean);
        return membershipsBeanJsonMapper.mapBeanToJson(createdBean);
    }

    @RequestMapping( value="/memberships/{userId}/{groupId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public MembershipsJson read(@PathVariable("userId") Integer userId, @PathVariable("groupId") Integer groupId)
    {
    	Memberships retrievedBean = membershipsService.findById(userId, groupId);
        return membershipsBeanJsonMapper.mapBeanToJson(retrievedBean);
    }

    @RequestMapping( value="/memberships/{userId}/{groupId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MembershipsJson update(@PathVariable("userId") Integer userId, @PathVariable("groupId") Integer groupId, @RequestBody MembershipsJson memberships)
    {
		Memberships convertedBean = membershipsBeanJsonMapper.mapJsonToBean(memberships);
		Memberships updatedBean = membershipsService.update(convertedBean);
        return membershipsBeanJsonMapper.mapBeanToJson(updatedBean);
    }

    @RequestMapping( value="/memberships/{userId}/{groupId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("userId") Integer userId, @PathVariable("groupId") Integer groupId)
    {
        membershipsService.delete(userId, groupId);
    }
}