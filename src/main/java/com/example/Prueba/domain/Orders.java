package com.example.Prueba.domain;

import com.example.Prueba.presistence.entity.Cliente;
import com.example.Prueba.presistence.entity.Platillo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class Orders {
    private Integer idOrders;
    private Integer idCustomer;
    private Integer idSaucer;
    private LocalDateTime dateTime;
    private String detail;

    private Customer customer;
    private Saucer saucer;

    public Integer getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(Integer idOrders) {
        this.idOrders = idOrders;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdSaucer() {
        return idSaucer;
    }

    public void setIdSaucer(Integer idSaucer) {
        this.idSaucer = idSaucer;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Saucer getSaucer() {
        return saucer;
    }

    public void setSaucer(Saucer saucer) {
        this.saucer = saucer;
    }
}
