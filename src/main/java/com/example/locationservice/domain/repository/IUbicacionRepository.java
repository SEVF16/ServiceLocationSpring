package com.example.locationservice.domain.repository;

import com.example.locationservice.domain.dto.UbicacionDTO;

import java.util.List;

public interface IUbicacionRepository {

    List<UbicacionDTO> getAll();

    UbicacionDTO getById(Integer id);

    UbicacionDTO guardar(UbicacionDTO ubicacionDTO);
}
