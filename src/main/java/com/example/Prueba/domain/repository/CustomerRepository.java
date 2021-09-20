package com.example.Prueba.domain.repository;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.presistence.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> getAll();
    Optional<List<Customer>> getByCustomerPhoneNumberAsc(int idCustumer);
    Optional<List<Customer>> getCustomerBypPhoneNumber(int phoneNumber);
    Optional<Customer> getCustomer(int idCustumer);
    Customer save(Customer idCustomer);
    void delete(int idCustomer);
}
