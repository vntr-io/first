package io.vntr.mapper;

import java.util.Date;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.jpa.bean.VentsEntity;
import io.vntr.bean.Vents;

public class VentsEntityBeanMapperTest
{
    private static final VentsEntityBeanMapper mapper = new VentsEntityBeanMapper();

    private static final Map<Vents, VentsEntity> beanToEntityMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToEntityMap
    }

    private static final Map<VentsEntity, Vents> entityToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out entityToBeanMap
    }

    @Test
    public void testMapBeanToEntity()
    {
        for(Vents input : beanToEntityMap.keySet())
        {
            VentsEntity expectedOutput = beanToEntityMap.get(input);
            VentsEntity output = mapper.mapBeanToEntity(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapEntityToBean()
    {
        for(VentsEntity input : entityToBeanMap.keySet())
        {
            Vents expectedOutput = entityToBeanMap.get(input);
            Vents output = mapper.mapEntityToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}