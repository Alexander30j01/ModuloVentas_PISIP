package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PedidosResponseDto;

@Mapper(componentModel = "spring", 
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PedidosDtoMapper {
	
	@Mapping(source = "idCliente", target = "cliente.idCliente")
	@Mapping(source = "idVendedor", target = "vendedor.idUsuario")
	Pedido toDomain(PedidosRequestDto dto);
	
	@Mapping(source = "estado", target = "estado")
	@Mapping(source = "cliente.idCliente", target = "idCliente")
	@Mapping(source = "vendedor.idUsuario", target = "idVendedor")
	PedidosResponseDto toResponse(Pedido pedidospojo);
}

