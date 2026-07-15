package com.uisrael.pisip.aplicacion.casouso.impl;

import org.springframework.stereotype.Repository;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;

@Repository
public class DocumentacionUseCaseImpl implements IDocumentacionUseCase {

	private final IDocumentacionRepositorio repositorio;

	public DocumentacionUseCaseImpl(IDocumentacionRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Documentacion subir(Documentacion documento) {
		documento.setFechaCarga(new java.sql.Date(System.currentTimeMillis()));
		documento.setEstado(true);
		return repositorio.guardar(documento);
	}

	@Override
	public Documentacion actualizar(int idDocumentacion, Documentacion documento) {
		repositorio.obtenerPorId(idDocumentacion).orElseThrow(
				() -> new RuntimeException("No se encontró el documento para actualizar con ID: " + idDocumentacion));
		return repositorio.guardar(documento);
	}

	@Override
	public void eliminarDocumento(int idDocumentacion) {
		repositorio.obtenerPorId(idDocumentacion)
				.orElseThrow(() -> new RuntimeException("No existe el documento con ID: " + idDocumentacion));
		repositorio.eliminar(idDocumentacion);

	}

	@Override
	public Documentacion validarDocumento(int idDocumentacion, boolean nuevoestado) {
		Documentacion documento = repositorio.obtenerPorId(idDocumentacion).orElseThrow(
				() -> new RuntimeException("No se encontró el documento para validar con ID:" + idDocumentacion));
		documento.setEstado(nuevoestado);
		return repositorio.guardar(documento);
	}

}
