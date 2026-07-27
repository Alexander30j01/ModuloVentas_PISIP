package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductoRequestDto {
	
	@NotNull
	private int idProductos;
	@NotBlank
	private String nombreProductos;
	@NotBlank
	private String descripcion;
	@NotNull
	private int stock;
	@NotNull
	private boolean estado;

}
