package com.example.Prueba.presistence.crud;

import com.example.Prueba.presistence.entity.Ordenes;
import org.springframework.data.repository.CrudRepository;

public interface OrdenesCrudRepository extends CrudRepository<Ordenes, Integer> {
}
