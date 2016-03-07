package io.vntr.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.jpa.bean.FriendshipsEntity;
import io.vntr.bean.Friendships;

public class FriendshipsEntityBeanMapperTest
{
    private static final FriendshipsEntityBeanMapper mapper = new FriendshipsEntityBeanMapper();

    private static final Map<Friendships, FriendshipsEntity> beanToEntityMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToEntityMap
    }

    private static final Map<FriendshipsEntity, Friendships> entityToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out entityToBeanMap
    }

    @Test
    public void testMapBeanToEntity()
    {
        for(Friendships input : beanToEntityMap.keySet())
        {
            FriendshipsEntity expectedOutput = beanToEntityMap.get(input);
            FriendshipsEntity output = mapper.mapBeanToEntity(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapEntityToBean()
    {
        for(FriendshipsEntity input : entityToBeanMap.keySet())
        {
            Friendships expectedOutput = entityToBeanMap.get(input);
            Friendships output = mapper.mapEntityToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}