package com.uisrael.pisip.dominio.entidades;

public class Producto {
	private int idProductos;
	private String nombreProductos;
	private String descripcion;
	
	
	public Producto(int idProductos, String nombreProductos, String descripcion) {
		super();
		this.idProductos = idProductos;
		this.nombreProductos = nombreProductos;
		this.descripcion = descripcion;
	}
	
	
	public Producto() {
		super();
	}


	public int getIdProductos() {
		return idProductos;
	}
	public void setIdProductos(int idProductos) {
		this.idProductos = idProductos;
	}
	public String getNombreProductos() {
		return nombreProductos;
	}
	public void setNombreProductos(String nombreProductos) {
		this.nombreProductos = nombreProductos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
