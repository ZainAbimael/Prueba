package com.example.Prueba.presistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenes")
public class Ordenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdenes;
    private Integer idCliente;
    private Integer idPlatillo;
    private LocalDateTime fechaHora;
    private String detalle;


    @ManyToOne
    @JoinColumn(name = "idCliente", insertable = false, updatable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idPlatillo", insertable = false, updatable = false)
    private Platillo platillo;


    public Integer getIdOrdenes() {
        return idOrdenes;
    }

    public void setIdOrdenes(Integer idOrdenes) {
        this.idOrdenes = idOrdenes;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }
}
