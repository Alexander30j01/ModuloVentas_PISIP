package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.presentacion.dto.request.DetallePedidoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DetallePedidoResponseDto;

@Mapper(componentModel = "spring")
public interface DetallePedidoDtoMapper {

	DetallePedido toDomain(DetallePedidoRequestDto dto);

	DetallePedidoResponseDto toResponse(DetallePedido detallePedidoPojo);

}
