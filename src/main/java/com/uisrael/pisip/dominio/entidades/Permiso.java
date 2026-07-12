package com.uisrael.pisip.dominio.entidades;

public class Permiso {

	private int idPermiso;
	private String nombre;
	private String descripcion;
	private boolean estado;

	public Permiso(int idPermiso, String nombre, String descripcion, boolean estado) {
		super();
		this.idPermiso = idPermiso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Permiso() {
		super();
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
