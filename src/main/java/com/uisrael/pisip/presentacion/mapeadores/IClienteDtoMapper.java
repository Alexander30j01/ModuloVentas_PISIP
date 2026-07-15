package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ClienteResponseDto;

@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {
	
	Cliente toDomain(ClienteRequestDto dto);
	
	ClienteResponseDto toResponseDto(Cliente clientePojo);
}
