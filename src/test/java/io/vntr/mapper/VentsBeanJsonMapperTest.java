package io.vntr.mapper;

import java.util.Date;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.bean.Vents;
import io.vntr.json.VentsJson;

public class VentsBeanJsonMapperTest
{
    private static final VentsBeanJsonMapper mapper = new VentsBeanJsonMapper();

    private static final Map<VentsJson, Vents> jsonToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out jsonToBeanMap
    }

    private static final Map<Vents, VentsJson> beanToJsonMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToJsonMap
    }

    @Test
    public void testMapBeanToJson()
    {
        for(Vents input : beanToJsonMap.keySet())
        {
            VentsJson expectedOutput = beanToJsonMap.get(input);
            VentsJson output = mapper.mapBeanToJson(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapJsonToBean()
    {
        for(VentsJson input : jsonToBeanMap.keySet())
        {
            Vents expectedOutput = jsonToBeanMap.get(input);
            Vents output = mapper.mapJsonToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}