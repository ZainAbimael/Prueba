package com.example.Prueba.presistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCLIENTE")
    private Integer idcliente;
    private String correo;
    private String nombre;
    private String domicilio;
    private Integer telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Ordenes> ordenes;

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public List<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }
}
