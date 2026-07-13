package com.uisrael.pisip.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DocumentacionRequestDto {
	@NotNull(message = "El id de documentación es obligatorio")
	private int idDocumentacion;
	@NotBlank(message = "El tipo de documentación es obligatorio")
	private String tipoDocumentacion;
	@NotNull
	private Date fechaCarga;
	@NotBlank(message = "La ruta es obligatoria")
	private String ruta;
	@NotNull
	private boolean estado;

}
