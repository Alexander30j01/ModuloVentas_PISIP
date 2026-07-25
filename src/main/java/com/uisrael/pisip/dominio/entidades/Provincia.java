package com.uisrael.pisip.dominio.entidades;

public class Provincia {

	private int idRegion;
	private String nombre;
	private boolean estado;
	private Usuarios vendedor;
	
	
	
	public Provincia() {
		super();
	}
	public Provincia(int idRegion, String nombre, boolean estado) {
		super();
		this.idRegion = idRegion;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Usuarios getVendedor() {
		return vendedor;
	}
	public void setVendedor(Usuarios vendedor) {
		this.vendedor = vendedor;
	}
	
	
}