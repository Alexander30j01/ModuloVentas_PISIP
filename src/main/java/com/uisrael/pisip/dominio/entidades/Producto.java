package com.uisrael.pisip.dominio.entidades;

public class Producto {
	private int idProductos;
	private String nombreProductos;
	private String descripcion;
	private String codigoSku;
	private int stock;
	private boolean estado;
	
	
	
	public Producto() {
		super();
	}
	public Producto(int idProductos, String nombreProductos, String descripcion, String codigoSku, int stock,
			boolean estado) {
		super();
		this.idProductos = idProductos;
		this.nombreProductos = nombreProductos;
		this.descripcion = descripcion;
		this.codigoSku = codigoSku;
		this.stock = stock;
		this.estado = estado;
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
	public String getCodigoSku() {
		return codigoSku;
	}
	public void setCodigoSku(String codigoSku) {
		this.codigoSku = codigoSku;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}