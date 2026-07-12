package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DetallePedidoEntity;

@Mapper(componentModel = "spring")
public interface IDetallePedidoJpaMapper {
	
	DetallePedido toDominio(DetallePedidoEntity entity);

	DetallePedidoEntity toEntity(DetallePedido detallepedido);

}
