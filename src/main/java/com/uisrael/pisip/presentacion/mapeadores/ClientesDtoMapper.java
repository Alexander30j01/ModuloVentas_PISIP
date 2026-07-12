package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.presentacion.dto.request.ClientesRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ClientesResponseDto;

@Mapper(componentModel = "spring")
public interface ClientesDtoMapper {
	
	Cliente toDomain(ClientesRequestDto dto);
	
	ClientesResponseDto toResponse(Cliente clientesPojo);
}
