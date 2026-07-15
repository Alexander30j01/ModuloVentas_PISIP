package com.uisrael.pisip.presentacion.dto.response;

import lombok.Data;

@Data
public class PermisoResponseDto {
	private int idPermiso;
	private String nombre;
	private String descripcion;
	private boolean estado;

}
