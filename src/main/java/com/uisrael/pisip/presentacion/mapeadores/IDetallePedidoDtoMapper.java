package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.presentacion.dto.request.DetallePedidoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DetallePedidoResponseDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDetallePedidoDtoMapper {

	@Mapping(target = "producto", ignore = true)
	DetallePedido toDomain(DetallePedidoRequestDto dto);

	DetallePedidoResponseDto toResponseDto(DetallePedido detallePedidoPojo);

}
