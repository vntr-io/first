package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.jpa.bean.MembershipsEntity;
import io.vntr.bean.Memberships;

@Component
public class MembershipsEntityBeanMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public Memberships mapEntityToBean(MembershipsEntity membershipsEntity)
    {
        if(membershipsEntity == null)
        {
            return null;
        }

        return modelMapper.map(membershipsEntity, Memberships.class);
    }

    public MembershipsEntity mapBeanToEntity(Memberships memberships)
    {
        if(memberships == null)
        {
            return null;
        }

        return modelMapper.map(memberships, MembershipsEntity.class);
    }

}