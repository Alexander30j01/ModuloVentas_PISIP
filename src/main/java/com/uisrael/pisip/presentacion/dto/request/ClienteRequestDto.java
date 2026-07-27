package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClienteRequestDto {
	
	@NotNull
	private int idCliente;
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
	@NotNull
	private boolean estado;

}
