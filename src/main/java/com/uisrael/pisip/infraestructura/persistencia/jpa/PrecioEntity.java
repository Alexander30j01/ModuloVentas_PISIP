package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
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
@Table(name = "precio")
public class PrecioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrecio;
	private BigDecimal precioBase;
	private BigDecimal porcentajeIva;
	private BigDecimal precioConIva;
	private boolean estado;

	@ManyToOne
	@JoinColumn(name = "fk_producto", nullable = false)
	private ProductoEntity producto;

}
