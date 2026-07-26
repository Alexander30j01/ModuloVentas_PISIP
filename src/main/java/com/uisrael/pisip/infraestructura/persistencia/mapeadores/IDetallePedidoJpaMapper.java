package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DetallePedidoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProductoJpaMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = { IProductoJpaMapper.class })
public interface IDetallePedidoJpaMapper {
	
	DetallePedido toDomain(DetallePedidoEntity entity);

	DetallePedidoEntity toEntity(DetallePedido detallePedidoPojo);

}
