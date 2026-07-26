package com.uisrael.pisip.dominio.entidades;

import java.math.BigDecimal;

public class Precio {

	private int idPrecio;
	private BigDecimal precioBase;
	private BigDecimal porcentajeIva;
	private BigDecimal precioConIva;
	private boolean estado;

	public Precio() {
		super();
	}

	public Precio(int idPrecio, BigDecimal precioBase, BigDecimal porcentajeIva, BigDecimal precioConIva,
			boolean estado) {
		super();
		this.idPrecio = idPrecio;
		this.precioBase = precioBase;
		this.porcentajeIva = porcentajeIva;
		this.precioConIva = precioConIva;
		this.estado = estado;
	}

	public int getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}

	public BigDecimal getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(BigDecimal porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	public BigDecimal getPrecioConIva() {
		return precioConIva;
	}

	public void setPrecioConIva(BigDecimal precioConIva) {
		this.precioConIva = precioConIva;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}