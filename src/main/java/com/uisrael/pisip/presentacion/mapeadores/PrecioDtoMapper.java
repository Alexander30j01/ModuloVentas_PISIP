package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.presentacion.dto.request.PrecioRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PrecioResponseDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrecioDtoMapper {
	
	Precio toDomain(PrecioRequestDto request);

    PrecioResponseDto toResponse(Precio dominio);

}
