package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.presentacion.dto.request.ProvinciaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProvinciaResponseDto;

@Mapper(componentModel = "spring")
public interface IProvinciaDtoMapper {

	Provincia toDomain(ProvinciaRequestDto dto);

	ProvinciaResponseDto toResponseDto(Provincia provinciaPojo);

}
