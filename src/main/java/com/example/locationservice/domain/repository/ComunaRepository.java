package com.example.locationservice.domain.repository;

import com.example.locationservice.domain.Comun;
import com.example.locationservice.domain.repository.ComunRepository;
import com.example.locationservice.persistence.crud.ComunaCrudRepository;
import com.example.locationservice.persistence.entity.Comuna;
import com.example.locationservice.persistence.mapper.ComunMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComunaRepository  implements ComunRepository{

    @Autowired
    private ComunaCrudRepository comunaCrudRepository;

    @Autowired
    private ComunMapper mapper;

    @Override
    public List<Comun> getAll(){
        List<Comuna> comunas = (List<Comuna>) comunaCrudRepository.findAll();


        return mapper.toComun(comunas);

    }
    @Override
    public Comun getComunaById(Long id){
        Comuna comuna = (Comuna) comunaCrudRepository.findComunaById(id);

        return mapper.toComun(comuna);
    }
}
