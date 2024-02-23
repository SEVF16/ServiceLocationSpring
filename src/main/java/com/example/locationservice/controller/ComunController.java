package com.example.locationservice.controller;

import com.example.locationservice.domain.Comun;
import com.example.locationservice.domain.service.ComunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comuna")
public class ComunController {
    @Autowired
    private ComunService comunService;

    @GetMapping("/allcomun")
    public List<Comun> getAll(){ return comunService.getAll(); }

    @GetMapping("/{id}")
    public Comun getById(@PathVariable Long id){ return comunService.buscarPorId(id); }

}
