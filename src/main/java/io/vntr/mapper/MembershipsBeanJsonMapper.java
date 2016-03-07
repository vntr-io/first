package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.bean.Memberships;
import io.vntr.json.MembershipsJson;

@Component
public class MembershipsBeanJsonMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public MembershipsJson mapBeanToJson(Memberships memberships)
    {
        if(memberships == null)
        {
            return null;
        }

        return modelMapper.map(memberships, MembershipsJson.class);
    }

    public Memberships mapJsonToBean(MembershipsJson membershipsJson)
    {
        if(membershipsJson == null)
        {
            return null;
        }

        return modelMapper.map(membershipsJson, Memberships.class);
    }
}