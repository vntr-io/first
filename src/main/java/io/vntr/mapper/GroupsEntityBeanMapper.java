package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.jpa.bean.GroupsEntity;
import io.vntr.bean.Groups;

@Component
public class GroupsEntityBeanMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public Groups mapEntityToBean(GroupsEntity groupsEntity)
    {
        if(groupsEntity == null)
        {
            return null;
        }

        return modelMapper.map(groupsEntity, Groups.class);
    }

    public GroupsEntity mapBeanToEntity(Groups groups)
    {
        if(groups == null)
        {
            return null;
        }

        return modelMapper.map(groups, GroupsEntity.class);
    }

}