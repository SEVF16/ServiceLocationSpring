package com.example.locationservice.domain.repository;



import com.example.locationservice.domain.dto.Comun;

import java.util.List;

public interface ComunRepository {

    List<Comun> getAll();

    Comun getComunaById(Long id);
}
