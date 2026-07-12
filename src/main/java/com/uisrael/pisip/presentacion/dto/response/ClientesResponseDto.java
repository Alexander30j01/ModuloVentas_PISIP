package com.uisrael.pisip.presentacion.dto.response;

import lombok.Data;

@Data
public class ClientesResponseDto {
	private int idClientes;
	private String ruc;
	private String telefono;
	private String nombreComercial;
	private String nombre;
	private String apellido;
	private String direccion;
	private String latitude;
	private String longitude;
	private boolean estado;

}
