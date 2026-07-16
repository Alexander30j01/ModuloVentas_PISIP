package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.presentacion.dto.request.DetallePedidoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DetallePedidoResponseDto;

@Mapper(componentModel = "spring")
public interface IDetallePedidoDtoMapper {

	DetallePedido toDomain(DetallePedidoRequestDto dto);

	DetallePedidoResponseDto toResponseDto(DetallePedido detallePedidoPojo);

}
