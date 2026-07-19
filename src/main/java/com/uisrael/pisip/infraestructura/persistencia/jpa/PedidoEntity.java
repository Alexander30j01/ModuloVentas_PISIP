package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.sql.Date;

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
@Table(name = "pedido")
public class PedidoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedidos;
	private Date fechaRegistro;
	private float subtotal;
	private float totalFinal;
	private String estadoPedido;
	private String metodoPago;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private UsuariosEntity fkUsuarioEntity;
}
