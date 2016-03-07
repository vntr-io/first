package io.vntr.mapper;

import java.util.List;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.bean.Groups;
import io.vntr.json.GroupsJson;

public class GroupsBeanJsonMapperTest
{
    private static final GroupsBeanJsonMapper mapper = new GroupsBeanJsonMapper();

    private static final Map<GroupsJson, Groups> jsonToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out jsonToBeanMap
    }

    private static final Map<Groups, GroupsJson> beanToJsonMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToJsonMap
    }

    @Test
    public void testMapBeanToJson()
    {
        for(Groups input : beanToJsonMap.keySet())
        {
            GroupsJson expectedOutput = beanToJsonMap.get(input);
            GroupsJson output = mapper.mapBeanToJson(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapJsonToBean()
    {
        for(GroupsJson input : jsonToBeanMap.keySet())
        {
            Groups expectedOutput = jsonToBeanMap.get(input);
            Groups output = mapper.mapJsonToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}