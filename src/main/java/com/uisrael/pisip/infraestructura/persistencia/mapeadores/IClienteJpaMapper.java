package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ClienteEntity;

@Mapper(componentModel = "spring")
public interface IClienteJpaMapper {

	Cliente toDominio(ClienteEntity entity);

	ClienteEntity toEntity(Cliente ClientePojo);

}
