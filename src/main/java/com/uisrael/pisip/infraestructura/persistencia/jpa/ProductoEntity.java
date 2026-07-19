package com.uisrael.pisip.infraestructura.persistencia.jpa;

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
@Table(name = "producto")
public class ProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProductos;
	private String nombreProductos;
	private String descripcion;
	private int stock;
	private boolean estado;
	
	@ManyToOne
    @JoinColumn(name = "fk_categoria")
    private CategoriaEntity fkCategoriaEntity;
}
