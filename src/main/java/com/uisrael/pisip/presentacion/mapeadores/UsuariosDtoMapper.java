package com.uisrael.pisip.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.presentacion.dto.request.UsuariosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.UsuariosResponseDto;

@Mapper(componentModel = "spring")
public interface UsuariosDtoMapper {

	Usuarios toDomain(UsuariosRequestDto dto);

	UsuariosResponseDto toResponse(Usuarios usuariosPojo);

}
