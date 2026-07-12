package com.uisrael.pisip.dominio.entidades;

import java.sql.Date;

public class Documentacion {

	private int idDocumentacion;
	private String tipoDocumentacion;
	private Date fechaCarga;
	private String ruta;
	private boolean estado;

	public Documentacion(int idDocumentacion, String tipoDocumentacion, Date fechaCarga, String ruta, boolean estado) {
		super();
		this.idDocumentacion = idDocumentacion;
		this.tipoDocumentacion = tipoDocumentacion;
		this.fechaCarga = fechaCarga;
		this.ruta = ruta;
		this.estado = estado;
	}

	public Documentacion() {
		super();
	}

	public int getIdDocumentacion() {
		return idDocumentacion;
	}

	public void setIdDocumentacion(int idDocumentacion) {
		this.idDocumentacion = idDocumentacion;
	}

	public String getTipoDocumentacion() {
		return tipoDocumentacion;
	}

	public void setTipoDocumentacion(String tipoDocumentacion) {
		this.tipoDocumentacion = tipoDocumentacion;
	}

	public Date getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(Date fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
