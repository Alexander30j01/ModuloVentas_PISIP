package com.uisrael.pisip.dominio.entidades;

public class SolicitudCredito {
	private int idSolicitudesCred;
	private float montoSolititado;
	private String estadoAprobacion;

	public SolicitudCredito(int idSolicitudesCred, float montoSolititado, String estadoAprobacion) {
		super();
		this.idSolicitudesCred = idSolicitudesCred;
		this.montoSolititado = montoSolititado;
		this.estadoAprobacion = estadoAprobacion;
	}

	public SolicitudCredito() {
		super();
	}

	public int getIdSolicitudesCred() {
		return idSolicitudesCred;
	}

	public void setIdSolicitudesCred(int idSolicitudesCred) {
		this.idSolicitudesCred = idSolicitudesCred;
	}

	public float getMontoSolititado() {
		return montoSolititado;
	}

	public void setMontoSolititado(float montoSolititado) {
		this.montoSolititado = montoSolititado;
	}

	public String getEstadoAprobacion() {
		return estadoAprobacion;
	}

	public void setEstadoAprobacion(String estadoAprobacion) {
		this.estadoAprobacion = estadoAprobacion;
	}

}
