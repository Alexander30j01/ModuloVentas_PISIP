package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "region")
public class RegionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRegion;
	private String nombre;
	private boolean estado;

}
