package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuariosRequestDto {
	@NotBlank
	private int idUsuario;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String rol;
	@NotBlank
	private String correoUsuario;

}
