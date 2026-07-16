package com.uisrael.pisip.presentacion.dto.response;


public class DetallePedidoResponseDto {
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;
	private float subTotal;
	private boolean estado;

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

}
