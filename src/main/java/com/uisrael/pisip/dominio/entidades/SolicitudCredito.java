package com.uisrael.pisip.dominio.entidades;

public class SolicitudCredito {
	private int idSolicitudesCred;
	private float montoSolitado;
	private String estadoAprobacion;

	private Cliente cliente;

	public SolicitudCredito() {
		super();
	}

	public SolicitudCredito(int idSolicitudesCred, float montoSolitado, String estadoAprobacion, Cliente cliente) {
		super();
		this.idSolicitudesCred = idSolicitudesCred;
		this.montoSolitado = montoSolitado;
		this.estadoAprobacion = estadoAprobacion;
		this.cliente = cliente;
	}

	public int getIdSolicitudesCred() {
		return idSolicitudesCred;
	}

	public void setIdSolicitudesCred(int idSolicitudesCred) {
		this.idSolicitudesCred = idSolicitudesCred;
	}

	public float getMontoSolitado() {
		return montoSolitado;
	}

	public void setMontoSolitado(float montoSolitado) {
		this.montoSolitado = montoSolitado;
	}

	public String getEstadoAprobacion() {
		return estadoAprobacion;
	}

	public void setEstadoAprobacion(String estadoAprobacion) {
		this.estadoAprobacion = estadoAprobacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
