package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "detalle_pedido")

public class DetallePedidoEntity {
	@Id
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;

}
