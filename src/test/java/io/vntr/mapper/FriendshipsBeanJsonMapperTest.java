package io.vntr.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.bean.Friendships;
import io.vntr.json.FriendshipsJson;

public class FriendshipsBeanJsonMapperTest
{
    private static final FriendshipsBeanJsonMapper mapper = new FriendshipsBeanJsonMapper();

    private static final Map<FriendshipsJson, Friendships> jsonToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out jsonToBeanMap
    }

    private static final Map<Friendships, FriendshipsJson> beanToJsonMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToJsonMap
    }

    @Test
    public void testMapBeanToJson()
    {
        for(Friendships input : beanToJsonMap.keySet())
        {
            FriendshipsJson expectedOutput = beanToJsonMap.get(input);
            FriendshipsJson output = mapper.mapBeanToJson(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapJsonToBean()
    {
        for(FriendshipsJson input : jsonToBeanMap.keySet())
        {
            Friendships expectedOutput = jsonToBeanMap.get(input);
            Friendships output = mapper.mapJsonToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}