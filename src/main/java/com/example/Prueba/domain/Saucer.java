package com.example.Prueba.domain;

import com.example.Prueba.presistence.entity.Ordenes;

import javax.persistence.OneToMany;
import java.util.List;

public class Saucer {
    private Integer idSaucer;
    private String name;
    private String description;
    private String price;
    private String typeKitchen;
    private String status;


    public Integer getIdSaucer() {
        return idSaucer;
    }

    public void setIdSaucer(Integer idSaucer) {
        this.idSaucer = idSaucer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTypeKitchen() {
        return typeKitchen;
    }

    public void setTypeKitchen(String typeKitchen) {
        this.typeKitchen = typeKitchen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
