package com.example.locationservice.persistence.mapper;
import com.example.locationservice.domain.Comun;
import com.example.locationservice.persistence.entity.Comuna;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComunMapper {
    ComunMapper INSTANCE = Mappers.getMapper(ComunMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "idC"),
            @Mapping(source = "nombreComuna", target = "nombre"),
            @Mapping(source = "idRegion", target = "idR")
    })
    Comun toComun(Comuna comuna);
    List <Comun> toComun(List<Comuna> comunas);

    @InheritInverseConfiguration
    @Mapping(target = "id",  ignore = true)
    Comuna toComuna(Comun Comun);
}
