package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ClientesEntity;

@Mapper(componentModel = "spring")
public interface IClientesJpaMapper {

	Cliente toDominio(ClientesEntity entity);

	ClientesEntity toEntity(Cliente clientes);

}
