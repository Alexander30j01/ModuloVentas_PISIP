package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PedidosResponseDto;

@Mapper(componentModel = "spring")
public interface PedidosDtoMapper {
	
	Pedidos toDomain(PedidosRequestDto dto);
	
	PedidosResponseDto toResponse(Pedidos pedidospojo);
}

