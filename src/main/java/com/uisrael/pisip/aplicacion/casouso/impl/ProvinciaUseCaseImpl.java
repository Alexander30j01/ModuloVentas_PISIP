package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProvinciaUseCase;
import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IProvinciaRepositorio;

public class ProvinciaUseCaseImpl implements IProvinciaUseCase {
	
	private final IProvinciaRepositorio repositorio;
	
	public ProvinciaUseCaseImpl(IProvinciaRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	@Override
	public Provincia registrar(Provincia provincia) {
		return repositorio.registrar(provincia);
	}

	@Override
	public Provincia actualizar(Provincia provincia) {
		return repositorio.actualizar(provincia);
	}

	@Override
	public Provincia asignarVendedor(Integer idProvincia, Usuarios usuarios) {
		// Lógica para asignar un vendedor a una provincia
		Provincia provincia = repositorio.obtenerPorId(idProvincia);
		if (provincia != null) {
			provincia.setVendedor(usuarios);
			return repositorio.actualizar(provincia);
		}
		return null; // O lanzar una excepción si la provincia no existe
	}

	@Override
	public Provincia removerVendedor(Integer idProvincia, Usuarios usuarios) {
		// Lógica para remover un vendedor de una provincia
		Provincia provincia = repositorio.obtenerPorId(idProvincia);
		if (provincia != null && provincia.getVendedor() != null && provincia.getVendedor().equals(usuarios)) {
			provincia.setVendedor(null);
			return repositorio.actualizar(provincia);
		}
		return null; // O lanzar una excepción si la provincia no existe o el vendedor no coincide
	}

	@Override
	public Provincia guardar(Provincia provincia) {
		return repositorio.guardar(provincia);
	}	
	
}