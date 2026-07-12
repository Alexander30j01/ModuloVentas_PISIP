package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "pedido")
public class PedidosEntity {
	@Id
	private int idPedidos;
	private Date fechaRegistro;
	private float subtotal;
	private float totalFinal;
	private String estadoPedido;
	private String metodoPago;
}
