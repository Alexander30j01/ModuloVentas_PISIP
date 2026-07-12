package com.uisrael.pisip.dominio.entidades;

import java.sql.Date;

public class Precio {
	
	private int idPrecio;
	private float precioVenta;
	private Date fechaInicio;
	private Date fechaFin;
	private boolean estadoPrecios;
	
	
	public Precio(int idPrecio, float precioVenta, Date fechaInicio, Date fechaFin, boolean estadoPrecios) {
		super();
		this.idPrecio = idPrecio;
		this.precioVenta = precioVenta;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estadoPrecios = estadoPrecios;
	}
	
	public Precio() {
		super();
	}

	public int getIdPrecios() {
		return idPrecio;
	}
	public void setIdPrecios(int idPrecios) {
		this.idPrecio = idPrecios;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public boolean isEstadoPrecios() {
		return estadoPrecios;
	}
	public void setEstadoPrecios(boolean estadoPrecios) {
		this.estadoPrecios = estadoPrecios;
	}
	
}
