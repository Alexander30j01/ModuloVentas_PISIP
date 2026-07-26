package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;

public interface ISolicitudCreditoRepositorio {

	SolicitudCredito guardar(SolicitudCredito solicitud);

	Optional<SolicitudCredito> buscarPorId(int idSolicitud);

	List<SolicitudCredito> listarTodo();

}
