package com.uisrael.pisip.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PrecioRequestDto {
	@NotBlank
	private int idPrecio;
	@NotBlank
	private float precioVenta;
	@NotBlank
	private Date fechaInicio;
	@NotBlank
	private Date fechaFin;
	@NotBlank
	private boolean estadoPrecios;

}
