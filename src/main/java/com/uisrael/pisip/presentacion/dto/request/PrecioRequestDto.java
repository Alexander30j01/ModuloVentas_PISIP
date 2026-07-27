package com.uisrael.pisip.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PrecioRequestDto {
	
	@NotNull
	private int idPrecio;
	@NotNull
	private float precioVenta;
	@NotBlank
	private Date fechaInicio;
	@NotBlank
	private Date fechaFin;
	@NotNull
	private boolean estadoPrecios;

}
