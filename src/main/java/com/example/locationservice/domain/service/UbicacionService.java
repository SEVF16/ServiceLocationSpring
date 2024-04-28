package com.example.locationservice.domain.service;

import com.example.locationservice.domain.dto.UbicacionDTO;
import com.example.locationservice.domain.repository.IUbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionService {

    @Autowired
    private IUbicacionRepository iUbicacionRepository;

    public List<UbicacionDTO> getAll(){
        return iUbicacionRepository.getAll();
    }

    public UbicacionDTO getById(Integer id){
        return iUbicacionRepository.getById(id);
    }

    public UbicacionDTO createUbi(UbicacionDTO ubiDTO) {
        if (ubiDTO.getLatitudUb() == null) {
            throw new IllegalArgumentException("La latitud no puede ser nula");
        }

        if (ubiDTO.getLongitudUb() == null) {
            throw new IllegalArgumentException("La longitud no puede ser nula");
        }

        double latitud = ubiDTO.getLatitudUb();
        double longitud = ubiDTO.getLongitudUb();

        if (latitud < -90.0 || latitud > 90.0) {
            throw new IllegalArgumentException("Latitud fuera de rango");
        }

        if (longitud < -180.0 || longitud > 180.0) {
            throw new IllegalArgumentException("Longitud fuera de rango");
        }

        return iUbicacionRepository.guardar(ubiDTO);
    }

}
