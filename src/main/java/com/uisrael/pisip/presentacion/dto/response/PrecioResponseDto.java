package com.uisrael.pisip.presentacion.dto.response;

import java.sql.Date;

import lombok.Data;

@Data
public class PrecioResponseDto {
	private int idPrecio;
	private float precioVenta;
	private Date fechaInicio;
	private Date fechaFin;
	private boolean estadoPrecios;

}
