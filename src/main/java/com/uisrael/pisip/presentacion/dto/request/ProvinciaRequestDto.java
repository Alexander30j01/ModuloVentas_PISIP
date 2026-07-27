package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProvinciaRequestDto {
	
	@NotNull
	private int idProvincia;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotNull
	private boolean estado;
	
	

}
