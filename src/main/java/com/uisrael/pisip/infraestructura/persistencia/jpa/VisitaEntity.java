package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "visita")
public class VisitaEntity {
	@Id
	private int idVisita;
	private Instant ingreso;
	private Instant salida;
	private double latitud;
	private double longitud;
	private String observacion;
	private boolean estado;

}
