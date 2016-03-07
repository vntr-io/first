package io.vntr.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.bean.Memberships;
import io.vntr.json.MembershipsJson;

public class MembershipsBeanJsonMapperTest
{
    private static final MembershipsBeanJsonMapper mapper = new MembershipsBeanJsonMapper();

    private static final Map<MembershipsJson, Memberships> jsonToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out jsonToBeanMap
    }

    private static final Map<Memberships, MembershipsJson> beanToJsonMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToJsonMap
    }

    @Test
    public void testMapBeanToJson()
    {
        for(Memberships input : beanToJsonMap.keySet())
        {
            MembershipsJson expectedOutput = beanToJsonMap.get(input);
            MembershipsJson output = mapper.mapBeanToJson(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapJsonToBean()
    {
        for(MembershipsJson input : jsonToBeanMap.keySet())
        {
            Memberships expectedOutput = jsonToBeanMap.get(input);
            Memberships output = mapper.mapJsonToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}