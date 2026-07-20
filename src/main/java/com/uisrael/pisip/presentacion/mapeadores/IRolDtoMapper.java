package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;
import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.presentacion.dto.request.RolRequestDto;
import com.uisrael.pisip.presentacion.dto.response.RolResponseDto;

@Mapper(componentModel = "spring")
public interface IRolDtoMapper {

	Rol toDomain(RolRequestDto dto);
	RolResponseDto toResponseDto(Rol rolPojo);

}
