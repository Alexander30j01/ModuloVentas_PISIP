package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "region")
public class RegionEntity {
	@Id
	private int idRegion;
	private String nombre;
	private boolean estado;

}
