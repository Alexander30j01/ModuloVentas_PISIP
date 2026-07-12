package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "solicitud_credito")
public class SolicitudCreditoEntity {
	@Id
	private int idSolicitudesCred;
	private float montoSolititado;
	private String estadoAprobacion;
}
