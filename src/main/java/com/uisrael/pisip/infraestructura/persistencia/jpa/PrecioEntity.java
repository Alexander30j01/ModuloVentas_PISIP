package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "precio")
public class PrecioEntity {
	@Id
	private int idPrecio;
	private float precioVenta;
	private Date fechaInicio;
	private Date fechaFin;
	private boolean estadoPrecios;
}
