package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;

public interface ISolicitudCreditoRepositorio {
	
	SolicitudCredito guardar(SolicitudCredito nuevosolicitudCredito);

	Optional<SolicitudCredito > buscarPorId(int idSolicitudCredito );

	List<SolicitudCredito > listarTodo();

	void eliminar(int idSolicitudCredito );
	
	SolicitudCredito registrar(SolicitudCredito solicitudCredito);
	
	SolicitudCredito aprobar(int idSolicitudCredito);
	
	SolicitudCredito rechazar(int idSolicitudCredito);

}
