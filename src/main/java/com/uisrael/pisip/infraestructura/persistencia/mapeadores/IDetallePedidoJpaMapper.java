package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DetallePedidoEntity;

@Mapper(componentModel = "spring")
public interface IDetallePedidoJpaMapper {
	
	DetallePedido toDomain(DetallePedidoEntity entity);

	DetallePedidoEntity toEntity(DetallePedido detallePedidoPojo);

}
