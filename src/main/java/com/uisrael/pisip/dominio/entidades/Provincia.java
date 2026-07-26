package com.uisrael.pisip.dominio.entidades;

public class Provincia {

	private int idProvincia;
	private String nombre;
	private boolean estado;
	private Usuarios vendedor;
	
	
	
	public Provincia() {
		super();
	}
	public Provincia(int idProvincia, String nombre, boolean estado) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
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