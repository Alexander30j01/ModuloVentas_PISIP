package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidoEntity;

@Mapper(componentModel = "spring")
public interface IPedidosJpaMapper {

	Pedidos toDominio(PedidoEntity entity);

	PedidoEntity toEntity(Pedidos pedidos);

}
