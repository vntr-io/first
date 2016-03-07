package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.jpa.bean.UsersEntity;
import io.vntr.bean.Users;

@Component
public class UsersEntityBeanMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public Users mapEntityToBean(UsersEntity usersEntity)
    {
        if(usersEntity == null)
        {
            return null;
        }

        return modelMapper.map(usersEntity, Users.class);
    }

    public UsersEntity mapBeanToEntity(Users users)
    {
        if(users == null)
        {
            return null;
        }

        return modelMapper.map(users, UsersEntity.class);
    }

}