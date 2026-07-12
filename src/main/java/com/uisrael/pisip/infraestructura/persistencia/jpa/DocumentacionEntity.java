package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "documentacion")
public class DocumentacionEntity {
	@Id
	private int idDocumentacion;
	private String tipoDocumentacion;
	private Date fechaCarga;
	private String ruta;
	private boolean estado;

}
