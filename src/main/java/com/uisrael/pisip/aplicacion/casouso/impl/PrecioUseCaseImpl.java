package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPrecioUseCase;
import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.dominio.repositorio.IPrecioRepositorio;

public class PrecioUseCaseImpl implements IPrecioUseCase {

	private final IPrecioRepositorio repositorio;

	public PrecioUseCaseImpl(IPrecioRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Precio guardar(Precio nuevaPrecio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Precio buscarPorId(int idPrecio) {
		return repositorio.buscarPorId(idPrecio).orElseThrow(()->new
				RuntimeException("Precio no encontrado"));
	}

	@Override
	public List<Precio> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idPrecio) {
		// TODO Auto-generated method stub

	}

}
