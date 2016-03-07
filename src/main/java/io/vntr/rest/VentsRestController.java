package io.vntr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vntr.bean.Vents;
import io.vntr.json.VentsJson;
import io.vntr.service.VentsService;
import io.vntr.mapper.VentsBeanJsonMapper;

@RestController
public class VentsRestController
{
    @Autowired
    private VentsService ventsService;

    @Autowired
    private VentsBeanJsonMapper ventsBeanJsonMapper;

    @RequestMapping( value="/vents", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public VentsJson create(@RequestBody VentsJson vents)
    {
		Vents convertedBean = ventsBeanJsonMapper.mapJsonToBean(vents);
		Vents createdBean = ventsService.create(convertedBean);
        return ventsBeanJsonMapper.mapBeanToJson(createdBean);
    }

    @RequestMapping( value="/vents/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public VentsJson read(@PathVariable("id") Integer id)
    {
    	Vents retrievedBean = ventsService.findById(id);
        return ventsBeanJsonMapper.mapBeanToJson(retrievedBean);
    }

    @RequestMapping( value="/vents/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public VentsJson update(@PathVariable("id") Integer id, @RequestBody VentsJson vents)
    {
		Vents convertedBean = ventsBeanJsonMapper.mapJsonToBean(vents);
		Vents updatedBean = ventsService.update(convertedBean);
        return ventsBeanJsonMapper.mapBeanToJson(updatedBean);
    }

    @RequestMapping( value="/vents/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") Integer id)
    {
        ventsService.delete(id);
    }
}