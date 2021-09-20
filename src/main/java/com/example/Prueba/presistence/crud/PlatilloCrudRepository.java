package com.example.Prueba.presistence.crud;

import com.example.Prueba.presistence.entity.Platillo;
import org.springframework.data.repository.CrudRepository;

public interface PlatilloCrudRepository extends CrudRepository<Platillo, Integer> {
}
