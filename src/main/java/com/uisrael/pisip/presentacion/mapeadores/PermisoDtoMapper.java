package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Permiso;
import com.uisrael.pisip.presentacion.dto.request.PermisoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PermisoResponseDto;

@Mapper(componentModel = "spring")
public interface PermisoDtoMapper {
	
	PermisoResponseDto toResponse(Permiso permiso);

	Permiso toDomain(PermisoRequestDto request);

}
