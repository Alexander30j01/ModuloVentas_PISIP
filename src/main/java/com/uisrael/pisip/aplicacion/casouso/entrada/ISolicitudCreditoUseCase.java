package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;

public interface ISolicitudCreditoUseCase {
	
	SolicitudCredito guardar(SolicitudCredito nuevaSolicitudCredito);

	SolicitudCredito buscarPorId(int idSolicitudCredito);

	List<SolicitudCredito> listarTodos();

	void eliminar(int idSolicitudCredito);
	
	SolicitudCredito registrar(SolicitudCredito solicitudCredito);

	SolicitudCredito aprobar(int idSolicitudCredito);
	
	SolicitudCredito rechazar(int idSolicitudCredito);
}
