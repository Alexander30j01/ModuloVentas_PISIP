package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SolicitudCreditoRequestDto {
	@NotBlank
	private int idSolicitudesCred;
	@NotBlank
	private float montoSolititado;
	@NotBlank
	private String estadoAprobacion;

}
