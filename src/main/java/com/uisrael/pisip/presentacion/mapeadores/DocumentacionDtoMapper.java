package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.presentacion.dto.request.DocumentacionRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DocumentacionResponseDto;

@Mapper(componentModel = "spring")
public interface DocumentacionDtoMapper {

	Documentacion toDomain(DocumentacionRequestDto dto);

	DocumentacionResponseDto toResponse(Documentacion documentacionPojo);

}
