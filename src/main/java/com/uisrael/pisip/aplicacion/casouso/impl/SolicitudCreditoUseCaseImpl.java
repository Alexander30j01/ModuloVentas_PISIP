package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;

public class SolicitudCreditoUseCaseImpl implements ISolicitudCreditoUseCase{
	
	private final ISolicitudCreditoRepositorio repositorio;
	

	public SolicitudCreditoUseCaseImpl(ISolicitudCreditoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public SolicitudCredito guardar(SolicitudCredito nuevaSolicitudCredito) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SolicitudCredito buscarPorId(int idSolicitudCredito) {
		return repositorio.buscarPorId(idSolicitudCredito).orElseThrow(()->new
				RuntimeException("Solicitud de Credito no encontrada"));
	}

	@Override
	public List<SolicitudCredito> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idSolicitudCredito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SolicitudCredito registrar(SolicitudCredito solicitudCredito) {

		 return repositorio.registrar(solicitudCredito);

	}
	
	@Override
	public SolicitudCredito aprobar(int idSolicitudCredito) {

	    return repositorio.aprobar(idSolicitudCredito);

	}
	
	@Override
	public SolicitudCredito rechazar(int idSolicitudCredito) {

	    return repositorio.rechazar(idSolicitudCredito);

	}
}
