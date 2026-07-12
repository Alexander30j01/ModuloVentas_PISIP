package com.uisrael.pisip.dominio.entidades;

import java.sql.Date;

public class Pedidos {
	private int idPedidos;
	private Date fechaRegistro;
	private float subtotal;
	private float totalFinal;
	private String estadoPedido;
	private String metodoPago;
	
	
	public Pedidos(int idPedidos, Date fechaRegistro, float subtotal, float totalFinal, String estadoPedido,
			String metodoPago) {
		super();
		this.idPedidos = idPedidos;
		this.fechaRegistro = fechaRegistro;
		this.subtotal = subtotal;
		this.totalFinal = totalFinal;
		this.estadoPedido = estadoPedido;
		this.metodoPago = metodoPago;
	}
	
	
	public Pedidos() {
		super();
	}


	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getTotalFinal() {
		return totalFinal;
	}
	public void setTotalFinal(float totalFinal) {
		this.totalFinal = totalFinal;
	}
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

}
