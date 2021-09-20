package com.example.Prueba.presistence;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.domain.repository.CustomerRepository;
import com.example.Prueba.presistence.crud.ClienteCrudRepository;
import com.example.Prueba.presistence.entity.Cliente;
import com.example.Prueba.presistence.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements CustomerRepository {
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;
    @Autowired
    private CustomerMapper mapper;

    @Override
    public List<Customer> getAll(){
         List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toCustomers(clientes);
    }

    @Override
    public Optional<List<Customer>> getByCustomerPhoneNumberAsc(int idCustumer) {
        List<Cliente> clientes = clienteCrudRepository.findByIdclienteOrderByTelefonoAsc(idCustumer);
        return Optional.of(mapper.toCustomers(clientes));
    }

    @Override
    public Optional<List<Customer>> getCustomerBypPhoneNumber(int phoneNumber) {
        Optional<List<Cliente>> clientes = clienteCrudRepository.findByTelefonoLessThanAndNombre(phoneNumber, "zain");
        return clientes.map(cl -> mapper.toCustomers(cl));
    }

    @Override
    public Optional<Customer> getCustomer(int idCustumer) {
        return clienteCrudRepository.findById(idCustumer).map(cliente -> mapper.toCustomer(cliente));
    }

    @Override
    public Customer save(Customer Customer) {
        Cliente cliente = mapper.toCliente(Customer);
        return mapper.toCustomer(clienteCrudRepository.save(cliente));
    }

    @Override
    public void delete(int idCustomer){
        clienteCrudRepository.deleteById(idCustomer);
    }
}
