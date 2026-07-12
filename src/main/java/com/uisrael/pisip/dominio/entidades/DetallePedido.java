package com.uisrael.pisip.dominio.entidades;

public class DetallePedido {
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;
	
	
	public DetallePedido(int idDetallePedidos, int cantidad, float precioUnitario) {
		super();
		this.idDetallePedidos = idDetallePedidos;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	
	
	public DetallePedido() {
		super();
	}


	public int getIdDetallePedidos() {
		return idDetallePedidos;
	}
	public void setIdDetallePedidos(int idDetallePedidos) {
		this.idDetallePedidos = idDetallePedidos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
