package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.bean.Friendships;
import io.vntr.json.FriendshipsJson;

@Component
public class FriendshipsBeanJsonMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public FriendshipsJson mapBeanToJson(Friendships friendships)
    {
        if(friendships == null)
        {
            return null;
        }

        return modelMapper.map(friendships, FriendshipsJson.class);
    }

    public Friendships mapJsonToBean(FriendshipsJson friendshipsJson)
    {
        if(friendshipsJson == null)
        {
            return null;
        }

        return modelMapper.map(friendshipsJson, Friendships.class);
    }
}