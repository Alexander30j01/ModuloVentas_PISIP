package com.uisrael.pisip.dominio.entidades;

public class Usuarios {
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String rol;
	private String correoUsuario;

	public Usuarios(int idUsuario, String nombre, String apellido, String rol, String correoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rol = rol;
		this.correoUsuario = correoUsuario;
	}

	public Usuarios() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

}
