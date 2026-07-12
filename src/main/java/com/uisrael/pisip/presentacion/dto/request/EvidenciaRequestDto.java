package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EvidenciaRequestDto {
	@NotBlank
	private int idEvidencias;
	@NotBlank
	private String rutaArchivoUrl;
	@NotBlank
	private String tipoEvidencia;

}
