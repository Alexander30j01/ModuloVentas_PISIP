package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Visita;
import com.uisrael.pisip.presentacion.dto.request.VisitaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.VisitaResponseDto;

@Mapper(componentModel = "spring")
public interface VisitaDtoMapper {

    Visita toDomain(VisitaRequestDto dto);

    VisitaResponseDto toResponse(Visita visita);

}
