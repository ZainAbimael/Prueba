package com.example.Prueba.presistence.mapper;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.presistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mappings({
            @Mapping(source = "idcliente", target = "idCustomer"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "domicilio", target = "address"),
            @Mapping(source = "telefono", target = "phoneNumber"),
    })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomers(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mapping(target = "ordenes", ignore = true)
    Cliente toCliente(Customer customer);
}
