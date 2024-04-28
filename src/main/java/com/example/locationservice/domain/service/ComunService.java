package com.example.locationservice.domain.service;

import com.example.locationservice.domain.dto.Comun;
import com.example.locationservice.domain.repository.ComunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunService {
    @Autowired
    private ComunRepository comunRepository;

    public List<Comun> getAll() { return comunRepository.getAll();}

    public Comun buscarPorId(Long id){
        return comunRepository.getComunaById(id);
    }
}
