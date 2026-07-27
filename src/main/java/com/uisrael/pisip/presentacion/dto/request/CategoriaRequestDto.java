package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoriaRequestDto {
	
	@NotNull
	private int idCategoria;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotNull
	private boolean estado;

}
