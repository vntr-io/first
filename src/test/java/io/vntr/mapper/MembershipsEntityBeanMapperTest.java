package io.vntr.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.jpa.bean.MembershipsEntity;
import io.vntr.bean.Memberships;

public class MembershipsEntityBeanMapperTest
{
    private static final MembershipsEntityBeanMapper mapper = new MembershipsEntityBeanMapper();

    private static final Map<Memberships, MembershipsEntity> beanToEntityMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToEntityMap
    }

    private static final Map<MembershipsEntity, Memberships> entityToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out entityToBeanMap
    }

    @Test
    public void testMapBeanToEntity()
    {
        for(Memberships input : beanToEntityMap.keySet())
        {
            MembershipsEntity expectedOutput = beanToEntityMap.get(input);
            MembershipsEntity output = mapper.mapBeanToEntity(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapEntityToBean()
    {
        for(MembershipsEntity input : entityToBeanMap.keySet())
        {
            Memberships expectedOutput = entityToBeanMap.get(input);
            Memberships output = mapper.mapEntityToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}