package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.dominio.entidades.SolicitudCredito;

public interface ISolicitudCreditoUseCase {
	
	SolicitudCredito registrar(SolicitudCredito solicitud);

    SolicitudCredito aprobar(int idSolicitud);

    SolicitudCredito rechazar(int idSolicitud, String motivo);

    boolean validarDocumentacion(int idSolicitud);

    SolicitudCredito agregarDocumento(int idSolicitud, Documentacion documento);

    SolicitudCredito cambiarEstado(int idSolicitud, String nuevoEstado);

    List<SolicitudCredito> listarSolicitud();
}
