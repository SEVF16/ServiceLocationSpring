package com.example.locationservice.persistence.mapper;
import com.example.locationservice.domain.dto.Comun;
import com.example.locationservice.domain.dto.Regi;
import com.example.locationservice.persistence.entity.Comuna;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = RegiMapper.class)
public interface ComunMapper {
    ComunMapper INSTANCE = Mappers.getMapper(ComunMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "idC"),
            @Mapping(source = "nombreComuna", target = "nombre"),
            @Mapping(target = "regi", ignore = true)
    })
    Comun toComun(Comuna comuna);
    List <Comun> toComun(List<Comuna> comunas);

    @InheritInverseConfiguration
    @Mapping(target = "id",  ignore = true)
    Comuna toComuna(Comun Comun);

    @AfterMapping
    default void setComunRegi(@MappingTarget Comun comun, Comuna comuna) {
        Regi r = RegiMapper.INSTANCE.toRegi(comuna.getRegion());



        comun.setRegi(r);
    }
}
