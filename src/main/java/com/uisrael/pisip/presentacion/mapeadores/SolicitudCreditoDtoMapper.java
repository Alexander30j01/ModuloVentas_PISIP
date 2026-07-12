package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.presentacion.dto.request.SolicitudCreditoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.SolicitudCreditoResponseDto;

@Mapper(componentModel = "spring")
public interface SolicitudCreditoDtoMapper {

	SolicitudCredito toDomain(SolicitudCreditoRequestDto dto);

	SolicitudCreditoResponseDto toResponse(SolicitudCredito solicitudCreditoPojo);

}
