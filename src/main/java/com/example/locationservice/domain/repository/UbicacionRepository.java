package com.example.locationservice.domain.repository;

import com.example.locationservice.domain.dto.UbicacionDTO;
import com.example.locationservice.persistence.crud.UbicacionCrudRepository;
import com.example.locationservice.persistence.entity.Ubicacion;
import com.example.locationservice.persistence.mapper.UbicacionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UbicacionRepository implements IUbicacionRepository{

    @Autowired
    private UbicacionCrudRepository ubicacionCrudRepository;
    @Autowired
    private UbicacionMapper ubicacionMapper;

    @Override
    public List<UbicacionDTO> getAll() {
        List<Ubicacion> ubicaciones = ubicacionCrudRepository.findAll();
        return ubicacionMapper.toUbicacionesDTO(ubicaciones);
    }

    @Override
    public UbicacionDTO getById(Integer id) {

        Ubicacion ubi = ubicacionCrudRepository.findUbicacionById(id);

        return ubicacionMapper.toUbicacionDto(ubi);
    }

    @Override
    public UbicacionDTO guardar(UbicacionDTO ubicacionDTO) {
        Ubicacion ubi = ubicacionCrudRepository.createUbicacion(ubicacionMapper.toUbicacion(ubicacionDTO));
        return ubicacionMapper.toUbicacionDto(ubi);
    }
}
