package io.vntr.mapper;

import java.util.List;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.jpa.bean.GroupsEntity;
import io.vntr.bean.Groups;

public class GroupsEntityBeanMapperTest
{
    private static final GroupsEntityBeanMapper mapper = new GroupsEntityBeanMapper();

    private static final Map<Groups, GroupsEntity> beanToEntityMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToEntityMap
    }

    private static final Map<GroupsEntity, Groups> entityToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out entityToBeanMap
    }

    @Test
    public void testMapBeanToEntity()
    {
        for(Groups input : beanToEntityMap.keySet())
        {
            GroupsEntity expectedOutput = beanToEntityMap.get(input);
            GroupsEntity output = mapper.mapBeanToEntity(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapEntityToBean()
    {
        for(GroupsEntity input : entityToBeanMap.keySet())
        {
            Groups expectedOutput = entityToBeanMap.get(input);
            Groups output = mapper.mapEntityToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}