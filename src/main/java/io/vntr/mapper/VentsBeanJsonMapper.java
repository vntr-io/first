package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.bean.Vents;
import io.vntr.json.VentsJson;

@Component
public class VentsBeanJsonMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public VentsJson mapBeanToJson(Vents vents)
    {
        if(vents == null)
        {
            return null;
        }

        return modelMapper.map(vents, VentsJson.class);
    }

    public Vents mapJsonToBean(VentsJson ventsJson)
    {
        if(ventsJson == null)
        {
            return null;
        }

        return modelMapper.map(ventsJson, Vents.class);
    }
}