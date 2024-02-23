package com.example.locationservice.persistence.crud;

import com.example.locationservice.persistence.entity.Comuna;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ComunaCrudRepository extends CrudRepository<Comuna, Long> {

    Comuna findComunaById(Long id);

    List<Comuna> findAll();
}
