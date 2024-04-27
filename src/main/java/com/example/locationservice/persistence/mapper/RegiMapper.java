package com.example.locationservice.persistence.mapper;

import com.example.locationservice.domain.Regi;
import com.example.locationservice.persistence.entity.Region;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RegiMapper {
    RegiMapper INSTANCE = Mappers.getMapper(RegiMapper.class);

    @Mappings({
            @Mapping(source = "idR", target = "id"),
            @Mapping(source = "name", target = "nombreRegion")
    })
    Region toRegion(Regi regi);

    @InheritInverseConfiguration
    Regi toRegi(Region region);
}
