package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.bean.Groups;
import io.vntr.json.GroupsJson;

@Component
public class GroupsBeanJsonMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public GroupsJson mapBeanToJson(Groups groups)
    {
        if(groups == null)
        {
            return null;
        }

        return modelMapper.map(groups, GroupsJson.class);
    }

    public Groups mapJsonToBean(GroupsJson groupsJson)
    {
        if(groupsJson == null)
        {
            return null;
        }

        return modelMapper.map(groupsJson, Groups.class);
    }
}