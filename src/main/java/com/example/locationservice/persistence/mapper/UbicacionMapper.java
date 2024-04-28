package com.example.locationservice.persistence.mapper;

import com.example.locationservice.domain.dto.UbicacionDTO;
import com.example.locationservice.persistence.entity.Ubicacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UbicacionMapper {

    UbicacionMapper INSTANCE = Mappers.getMapper(UbicacionMapper.class);

    @Mappings({
            @Mapping(source = "idUb", target = "id"),
            @Mapping(source = "latitudUb", target = "latitud"),
            @Mapping(source = "longitudUb", target = "longitud")
    })
    Ubicacion toUbicacion(UbicacionDTO ubiDTO);

    @InheritInverseConfiguration
    UbicacionDTO toUbicacionDto(Ubicacion ubi);

    List<UbicacionDTO> toUbicacionesDTO(List<Ubicacion> ubicaciones);
}
