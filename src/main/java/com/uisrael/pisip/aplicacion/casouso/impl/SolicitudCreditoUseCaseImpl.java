package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;

public class SolicitudCreditoUseCaseImpl implements ISolicitudCreditoUseCase {

	private final ISolicitudCreditoRepositorio repositorio;

	public SolicitudCreditoUseCaseImpl(ISolicitudCreditoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public SolicitudCredito registrar(SolicitudCredito solicitud) {
		solicitud.setEstadoAprobacion("PENDIENTE");
		return repositorio.guardar(solicitud);
	}

	@Override
	public SolicitudCredito buscarPorId(int idSolicitud) {
		return obtenerPorId(idSolicitud);
	}

	@Override
	public SolicitudCredito aprobar(int idSolicitudesCred) {
		SolicitudCredito solicitud = obtenerPorId(idSolicitudesCred);
		if (!validarDocumentacion(idSolicitudesCred)) {
			throw new RuntimeException("No se puede aprobar: La documentación está incompleta o no es válida.");
		}
		solicitud.setEstadoAprobacion("APROBADO");
		return repositorio.guardar(solicitud);
	}

	@Override
	public SolicitudCredito rechazar(int idSolicitud, String motivo) {
		SolicitudCredito solicitud = obtenerPorId(idSolicitud);
		solicitud.setEstadoAprobacion("RECHAZADO");
		return repositorio.guardar(solicitud);
	}

	@Override
	public boolean validarDocumentacion(int idSolicitudesCred) {
		SolicitudCredito solicitud = obtenerPorId(idSolicitudesCred);
		if (solicitud.getDocumentos() == null || solicitud.getDocumentos().isEmpty()) {
			return false;
		}
		return solicitud.getDocumentos().stream()
				.allMatch(doc -> doc != null && doc.getRuta() != null && !doc.getRuta().trim().isEmpty());
	}

	@Override
	public SolicitudCredito agregarDocumento(int idSolicitud, Documentacion documento) {
		SolicitudCredito solicitud = obtenerPorId(idSolicitud);
		solicitud.getDocumentos().add(documento);
		return repositorio.guardar(solicitud);
	}

	@Override
	public SolicitudCredito cambiarEstado(int idSolicitud, String nuevoEstado) {
		SolicitudCredito solicitud = obtenerPorId(idSolicitud);
		solicitud.setEstadoAprobacion(nuevoEstado);
		return repositorio.guardar(solicitud);
	}

	@Override
	public List<SolicitudCredito> listarTodos() {
		return repositorio.listarTodo();
	}

	private SolicitudCredito obtenerPorId(int idSolicitud) {
		return repositorio.buscarPorId(idSolicitud)
				.orElseThrow(() -> new RuntimeException("Solicitud de crédito no encontrada con ID: " + idSolicitud));
	}

}
