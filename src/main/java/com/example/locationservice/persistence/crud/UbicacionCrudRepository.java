package com.example.locationservice.persistence.crud;

import com.example.locationservice.persistence.entity.Comuna;
import com.example.locationservice.persistence.entity.Ubicacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UbicacionCrudRepository extends CrudRepository<Ubicacion, Integer> {

    Ubicacion findUbicacionById(Integer id);

    List <Ubicacion> findAll();

    default Ubicacion createUbicacion(Ubicacion ubicacion) {
        return save(ubicacion);
    }
}
