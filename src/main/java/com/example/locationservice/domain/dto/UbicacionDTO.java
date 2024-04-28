package com.example.locationservice.domain.dto;

public class UbicacionDTO {
    private Integer idUb;
    private Double latitudUb;
    private Double longitudUb;

    public Integer getIdUb() {
        return idUb;
    }

    public void setIdUb(Integer idUb) {
        this.idUb = idUb;
    }

    public Double getLatitudUb() {
        return latitudUb;
    }

    public void setLatitudUb(Double latitudUb) {
        this.latitudUb = latitudUb;
    }

    public Double getLongitudUb() {
        return longitudUb;
    }

    public void setLongitudUb(Double longitudUb) {
        this.longitudUb = longitudUb;
    }
}
