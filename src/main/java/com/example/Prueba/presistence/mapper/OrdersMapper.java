package com.example.Prueba.presistence.mapper;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.domain.Orders;
import com.example.Prueba.presistence.entity.Cliente;
import com.example.Prueba.presistence.entity.Ordenes;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class, SaucerMapper.class})
public interface OrdersMapper {
    @Mappings({
            @Mapping(source = "idOrdenes", target = "idOrders"),
            @Mapping(source = "idCliente", target = "idCustomer"),
            @Mapping(source = "idPlatillo", target = "idSaucer"),
            @Mapping(source = "fechaHora", target = "dateTime"),
            @Mapping(source = "detalle", target = "detail"),
            @Mapping(source = "cliente", target = "customer"),
            @Mapping(source = "platillo", target = "saucer"),
    })
    Orders toOrders(Ordenes ordenes);

    @InheritInverseConfiguration
    Ordenes toOrdenes(Orders orders);

    List<Orders> toOrders(List<Ordenes> ordenes);
}
