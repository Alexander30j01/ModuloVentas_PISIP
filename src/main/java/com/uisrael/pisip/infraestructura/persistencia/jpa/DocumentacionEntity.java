package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "documentacion")
public class DocumentacionEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idDocumentacion;
	private String tipoDocumentacion;
	private Date fechaCarga;
	private String ruta;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "fk_solicitud_credito", nullable = false)
	private SolicitudCreditoEntity solicitudCredito;

}
