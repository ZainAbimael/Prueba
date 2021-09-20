package com.example.Prueba.domain.service;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.domain.repository.CustomerRepository;
import com.example.Prueba.presistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }

    public Optional<List<Customer>> getByCustomerPhoneNumberAsc(int idCustumer) {
        return customerRepository.getByCustomerPhoneNumberAsc(idCustumer);
    }

    public Optional<List<Customer>> getCustomerBypPhoneNumber(int phoneNumber) {
        return customerRepository.getCustomerBypPhoneNumber(phoneNumber);
    }

    public Optional<Customer> getCustomer(int idCustumer) {
        return customerRepository.getCustomer(idCustumer);
    }

    public Customer save(Customer Customer) {
        return customerRepository.save(Customer);

    }
    public boolean delete(int idCustomer){
        return getCustomer(idCustomer) .map(customer ->{
            customerRepository.delete(idCustomer);
            return true;
        }).orElse(false);
    }
}
