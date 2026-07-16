package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaRequestDto {
	@NotBlank
	private int idCategoria;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotBlank
	private boolean estado;

}
