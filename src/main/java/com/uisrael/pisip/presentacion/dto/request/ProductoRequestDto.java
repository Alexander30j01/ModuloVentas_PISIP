package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductoRequestDto {
	@NotBlank
	private int idProductos;
	@NotBlank
	private String nombreProductos;
	@NotBlank
	private String descripcion;

}
