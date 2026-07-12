package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "evidencia_crediticia")
public class EvidenciaEntity {
	@Id
	private int idEvidencias;
	private String rutaArchivoUrl;
	private String tipoEvidencia;

}
