package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Categoria;
import com.uisrael.pisip.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.CategoriaResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {

	Categoria toDomain(CategoriaRequestDto dto);

	CategoriaResponseDto toResponseDto(Categoria categoriaPojo);

}
