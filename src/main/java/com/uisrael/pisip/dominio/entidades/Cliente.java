package com.uisrael.pisip.dominio.entidades;
//franklinA
public class Cliente {
	private int idCliente;
	private String ruc;
	private String telefono;
	private String nombreComercial;
	private String nombre;
	private String apellido;
	private String direccion;
	private String latitude;
	private String longitude;
	private boolean estado;

	public Cliente(int idCliente, String ruc, String telefono, String nombreComercial, String nombre, String apellido,
			String direccion, String latitude, String longitude, boolean estado) {
		super();
		this.idCliente = idCliente;
		this.ruc = ruc;
		this.telefono = telefono;
		this.nombreComercial = nombreComercial;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.latitude = latitude;
		this.longitude = longitude;
		this.estado = estado;
	}

	public Cliente() {
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
