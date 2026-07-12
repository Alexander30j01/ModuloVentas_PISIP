package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ZonaVentaRequestDto {
	@NotBlank
	private int idZonaventa;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;

}
