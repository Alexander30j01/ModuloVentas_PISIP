package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.ICategoriaUseCase;
import com.uisrael.pisip.dominio.entidades.Categoria;
import com.uisrael.pisip.dominio.repositorio.ICategoriaRepositorio;

public class CategoriaUseCaseImpl implements ICategoriaUseCase {

	private final ICategoriaRepositorio repositorio;

	public CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Categoria registrar(Categoria categoria) {
		return repositorio.registrar(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		return repositorio.actualizar(categoria);
	}

	@Override
	public void cambiarEstado(Categoria categoria, boolean activo) {
		repositorio.cambiarEstado(categoria, activo);
	}

}
