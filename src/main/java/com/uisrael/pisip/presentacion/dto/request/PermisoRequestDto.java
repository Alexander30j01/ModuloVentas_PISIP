package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PermisoRequestDto {
	@NotNull(message = "El id de permiso es obligatorio")
	private int idPermiso;

	@NotBlank(message = "El nombre es obligatorio")
	private String nombre;

	@NotBlank
	private String descripcion;

	@NotNull
	private boolean estado;

}
