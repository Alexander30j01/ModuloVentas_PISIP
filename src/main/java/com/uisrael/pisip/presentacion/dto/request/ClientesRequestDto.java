package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientesRequestDto {
	
	private int idClientes;
	@NotBlank
	private String ruc;
	@NotBlank
	private String telefono;
	@NotBlank
	private String nombreComercial;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String direccion;
	@NotBlank
	private String latitude;
	@NotBlank
	private String longitude;
	@NotBlank
	private boolean estado;

}
