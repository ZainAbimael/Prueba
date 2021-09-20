package com.example.Prueba.we.controller;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    public Optional<List<Customer>> getByCustomerPhoneNumberAsc(int idCustumer) {
        return customerService.getByCustomerPhoneNumberAsc(idCustumer);
    }

    public Optional<List<Customer>> getCustomerBypPhoneNumber(Integer phoneNumber) {
        return customerService.getCustomerBypPhoneNumber(phoneNumber);
    }

    public Optional<Customer> getCustomer(int idCustumer) {
        return customerService.getCustomer(idCustumer);
    }

    public Customer save(Customer Customer) {
        return customerService.save(Customer);

    }
    public boolean delete(int idCustomer){
        return customerService.delete(idCustomer);
    }
}
