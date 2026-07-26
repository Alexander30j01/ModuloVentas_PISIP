
package com.uisrael.pisip.dominio.entidades;

import java.util.ArrayList;
import java.util.List;

public class SolicitudCredito {
	private int idSolicitudesCred;
	private float montoSolitado;
	private String estadoAprobacion;

	private Cliente cliente;

	private List<Documentacion> documentos = new ArrayList<>();

	public SolicitudCredito() {
		super();
	}

	public SolicitudCredito(int idSolicitudesCred, float montoSolitado, String estadoAprobacion, Cliente cliente,
			List<Documentacion> documentos, String urlArchivo) {
		super();
		this.idSolicitudesCred = idSolicitudesCred;
		this.montoSolitado = montoSolitado;
		this.estadoAprobacion = estadoAprobacion;
		this.cliente = cliente;
		this.documentos = documentos;
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

	public List<Documentacion> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documentacion> documentos) {
		this.documentos = documentos;
	}

}