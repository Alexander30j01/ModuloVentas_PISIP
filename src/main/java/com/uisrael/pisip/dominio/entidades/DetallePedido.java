package com.uisrael.pisip.dominio.entidades;

public class DetallePedido {
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;
	private float subTotal;
	private boolean estado;

	public DetallePedido() {
		super();
	}

	public DetallePedido(int idDetallePedidos, int cantidad, float precioUnitario, float subTotal, boolean estado,
			Producto producto) {
		super();
		this.idDetallePedidos = idDetallePedidos;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subTotal = subTotal;
		this.estado = estado;
		this.producto = producto;
	}

	private Producto producto;

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

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}