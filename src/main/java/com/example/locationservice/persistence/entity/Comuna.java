package com.example.locationservice.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comuna")
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "nombre_comuna")
    private String nombreComuna;
    @Column(name = "region_id")
    private int idRegion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
}
