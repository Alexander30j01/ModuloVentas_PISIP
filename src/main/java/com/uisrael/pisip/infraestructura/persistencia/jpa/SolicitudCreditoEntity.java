package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "solicitud_credito")
public class SolicitudCreditoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSolicitudesCred;

	private float montoSolititado;

	private String estadoAprobacion;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_cliente")
	private ClienteEntity fkClienteEntity;
}