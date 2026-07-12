package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name="zona_venta")
public class ZonaventaEntity {
	@Id
	private int idZonaventa;
	private String nombre;
	private String descripcion;

}
