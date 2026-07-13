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

	

}
