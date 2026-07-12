package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class ProductoEntity {

	@Id
	private int idProductos;
	private String nombreProductos;
	private String descripcion;
}
