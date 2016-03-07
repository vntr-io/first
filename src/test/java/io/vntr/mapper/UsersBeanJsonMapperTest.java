package io.vntr.mapper;

import java.util.List;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.vntr.bean.Users;
import io.vntr.json.UsersJson;

public class UsersBeanJsonMapperTest
{
    private static final UsersBeanJsonMapper mapper = new UsersBeanJsonMapper();

    private static final Map<UsersJson, Users> jsonToBeanMap = new HashMap<>();
    static
    {
        //TODO: fill out jsonToBeanMap
    }

    private static final Map<Users, UsersJson> beanToJsonMap = new HashMap<>();
    static
    {
        //TODO: fill out beanToJsonMap
    }

    @Test
    public void testMapBeanToJson()
    {
        for(Users input : beanToJsonMap.keySet())
        {
            UsersJson expectedOutput = beanToJsonMap.get(input);
            UsersJson output = mapper.mapBeanToJson(input);
            assertEquals(output, expectedOutput);
        }
    }

    @Test
    public void testMapJsonToBean()
    {
        for(UsersJson input : jsonToBeanMap.keySet())
        {
            Users expectedOutput = jsonToBeanMap.get(input);
            Users output = mapper.mapJsonToBean(input);
            assertEquals(output, expectedOutput);
        }
    }
}