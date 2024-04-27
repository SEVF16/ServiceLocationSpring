package com.example.locationservice.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "nombre_region")
    private String nombreRegion;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<Comuna> comuna = new ArrayList<>();;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public List<Comuna> getComuna() {
        return comuna;
    }

    public void setComuna(List<Comuna> comuna) {
        this.comuna = comuna;
    }
}
