package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProductoResponseDto;

@Mapper(componentModel = "spring")
public interface ProductoDtoMapper {
	
	Producto toDomain(ProductoRequestDto dto);
	
	ProductoResponseDto toResponse(Producto productoPojo);

}
