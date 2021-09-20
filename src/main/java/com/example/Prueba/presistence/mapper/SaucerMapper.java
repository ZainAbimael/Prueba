package com.example.Prueba.presistence.mapper;

import com.example.Prueba.domain.Customer;
import com.example.Prueba.domain.Saucer;
import com.example.Prueba.presistence.entity.Cliente;
import com.example.Prueba.presistence.entity.Platillo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SaucerMapper {
    @Mappings({
            @Mapping(source = "idPlatillo", target = "idSaucer"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "tipoDeCosina", target = "typeKitchen"),
            @Mapping(source = "estatus", target = "status"),
    })
    Saucer toSaucer(Platillo platillo);

    @InheritInverseConfiguration
    @Mapping(target = "ordenes", ignore = true)
    Platillo toPlatillo(Saucer saucer);
}
