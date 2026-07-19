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
@Table(name = "detalle_pedido")

public class DetallePedidoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;
	private float subTotal;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "fk_pedido", nullable = false)
	private PedidoEntity pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_producto", nullable = false)
	private ProductoEntity producto;

}
