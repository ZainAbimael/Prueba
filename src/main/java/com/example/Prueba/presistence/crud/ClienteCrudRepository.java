package com.example.Prueba.presistence.crud;

import com.example.Prueba.presistence.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
    //@Query(value = "SELECT * FROM CLIENTE WHERE IDCLIENTE = ?", nativeQuery = true)
    List<Cliente> findByIdclienteOrderByTelefonoAsc(int idCliente);
    Optional<List<Cliente>> findByTelefonoLessThanAndNombre(int telefono, String nombre);
}
