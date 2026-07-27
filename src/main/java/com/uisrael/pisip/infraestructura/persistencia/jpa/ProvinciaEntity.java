package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "provincia")
public class ProvinciaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvincia;
	private String nombre;
	private boolean estado;
	

}
