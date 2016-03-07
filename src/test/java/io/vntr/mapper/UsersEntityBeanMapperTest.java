package io.vntr.mapper;

import java.util.List;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.jpa.bean.UsersEntity;
import io.vntr.bean.Users;

public class UsersEntityBeanMapperTest
{
    private static final UsersEntityBeanMapper mapper = new UsersEntityBeanMapper();

    private static final Map<Users, UsersEntity> beanToEntityMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToEntityMap
    }

    private static final Map<UsersEntity, Users> entityToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out entityToBeanMap
    }

    @Test
    public void testMapBeanToEntity()
    {
        for(Users input : beanToEntityMap.keySet())
        {
            UsersEntity expectedOutput = beanToEntityMap.get(input);
            UsersEntity output = mapper.mapBeanToEntity(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapEntityToBean()
    {
        for(UsersEntity input : entityToBeanMap.keySet())
        {
            Users expectedOutput = entityToBeanMap.get(input);
            Users output = mapper.mapEntityToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}