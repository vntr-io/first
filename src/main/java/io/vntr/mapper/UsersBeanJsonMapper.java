package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.bean.Users;
import io.vntr.json.UsersJson;

@Component
public class UsersBeanJsonMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public UsersJson mapBeanToJson(Users users)
    {
        if(users == null)
        {
            return null;
        }

        return modelMapper.map(users, UsersJson.class);
    }

    public Users mapJsonToBean(UsersJson usersJson)
    {
        if(usersJson == null)
        {
            return null;
        }

        return modelMapper.map(usersJson, Users.class);
    }
}