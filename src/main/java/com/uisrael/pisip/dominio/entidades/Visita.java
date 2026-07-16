package com.uisrael.pisip.dominio.entidades;

import java.time.Instant;
import java.time.Duration;

public class Visita {

	private int idVisita;
	private Instant ingreso;
	private Instant salida;
	private double latitud;
	private double longitud;
	private String observacion;
	private boolean estado;

	public Visita(int idVisita, Instant ingreso, Instant salida, double latitud, double longitud, String observacion,
			boolean estado) {
		super();
		this.idVisita = idVisita;
		this.ingreso = ingreso;
		this.salida = salida;
		this.latitud = latitud;
		this.longitud = longitud;
		this.observacion = observacion;
		this.estado = estado;
	}

	public Visita() {
		super();
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public Instant getIngreso() {
		return ingreso;
	}

	public void setIngreso(Instant ingreso) {
		this.ingreso = ingreso;
	}

	public Instant getSalida() {
		return salida;
	}

	public void setSalida(Instant salida) {
		this.salida = salida;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void registrarIngreso() {
	    this.ingreso = Instant.now();
	}
	
	public void registrarSalida() {
	    this.salida = Instant.now();
	}
	
	public void registrarUbicacion(double latitud, double longitud) {

	    this.latitud = latitud;
	    this.longitud = longitud;

	}
	
	public long calcularTiempoVisita() {

	    if (ingreso != null && salida != null) {
	        return Duration.between(ingreso, salida).getSeconds();
	    }

	    return 0;
	}
	
	public void agregarObservacion(String observacion) {
	    this.observacion = observacion;
	}

}
