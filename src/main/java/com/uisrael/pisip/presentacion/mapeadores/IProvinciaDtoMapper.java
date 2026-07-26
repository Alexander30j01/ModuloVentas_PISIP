package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.presentacion.dto.request.ProvinciaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProvinciaResponseDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProvinciaDtoMapper {

	@Mapping(target = "vendedor", ignore = true)
	Provincia toDomain(ProvinciaRequestDto dto);

	ProvinciaResponseDto toResponseDto(Provincia provinciaPojo);

}
