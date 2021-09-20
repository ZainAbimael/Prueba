package com.example.Prueba.presistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "platillo")
public class Platillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlatillo;
    private String nombre;
    private String descripcion;
    private String precio;
    private String tipoDeCosina;
    private String estatus;

    @OneToMany(mappedBy = "platillo")
    private List<Ordenes> ordenes;

    public Integer getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipoDeCosina() {
        return tipoDeCosina;
    }

    public void setTipoDeCosina(String tipoDeCosina) {
        this.tipoDeCosina = tipoDeCosina;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }
}
