package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SolicitudCreditoRequestDto {

	private int idSolicitudesCred;

	@NotNull
	private float montoSolititado;

	private String estadoAprobacion;

	
	private ClienteRequestDto cliente;

}