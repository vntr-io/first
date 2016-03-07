package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.jpa.bean.FriendshipsEntity;
import io.vntr.bean.Friendships;

@Component
public class FriendshipsEntityBeanMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public Friendships mapEntityToBean(FriendshipsEntity friendshipsEntity)
    {
        if(friendshipsEntity == null)
        {
            return null;
        }

        return modelMapper.map(friendshipsEntity, Friendships.class);
    }

    public FriendshipsEntity mapBeanToEntity(Friendships friendships)
    {
        if(friendships == null)
        {
            return null;
        }

        return modelMapper.map(friendships, FriendshipsEntity.class);
    }

}