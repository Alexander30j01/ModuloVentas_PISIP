package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidoEntity;

@Mapper(componentModel = "spring")
public interface IPedidosJpaMapper {

	Pedido toDominio(PedidoEntity entity);
	
	PedidoEntity toEntity(Pedido pedidos);

}
