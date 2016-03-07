package io.vntr.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.vntr.jpa.bean.VentsEntity;
import io.vntr.bean.Vents;

@Component
public class VentsEntityBeanMapper
{
    private ModelMapper modelMapper = createModelMapper(false);

    private static ModelMapper createModelMapper(boolean summary)
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public Vents mapEntityToBean(VentsEntity ventsEntity)
    {
        if(ventsEntity == null)
        {
            return null;
        }

        return modelMapper.map(ventsEntity, Vents.class);
    }

    public VentsEntity mapBeanToEntity(Vents vents)
    {
        if(vents == null)
        {
            return null;
        }

        return modelMapper.map(vents, VentsEntity.class);
    }

}