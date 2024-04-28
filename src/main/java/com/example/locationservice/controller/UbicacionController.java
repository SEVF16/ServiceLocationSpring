package com.example.locationservice.controller;

import com.example.locationservice.domain.dto.Comun;
import com.example.locationservice.domain.dto.UbicacionDTO;
import com.example.locationservice.domain.service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ubicacion")
@CrossOrigin(origins = "*")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping("/allubi")
    public List<UbicacionDTO> getAll(){ return ubicacionService.getAll(); }

    @PostMapping
    public ResponseEntity<UbicacionDTO> guardarUbicacion(@RequestBody UbicacionDTO ubicacionDTO) {
        try {
            UbicacionDTO ubicacionGuardada = ubicacionService.createUbi(ubicacionDTO);
            return ResponseEntity.ok(ubicacionGuardada);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

}
