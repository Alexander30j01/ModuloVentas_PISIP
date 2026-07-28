package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProvinciaUseCase;
import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IProvinciaRepositorio;

@Service
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

	@Override
	public Provincia buscarPorNombre(String nombre) {
		return repositorio.buscarPorNombre(nombre);
	}

	@Override
	public Provincia obtenerPorId(Integer idProvincia) {
		return repositorio.obtenerPorId(idProvincia);
	}

	@Override
	public void cambiarEstado(Provincia provincia, boolean activo) {
		repositorio.cambiarEstado(provincia, activo);
	}

	@Override
	public List<Provincia> listarTodo() {
		return repositorio.listarTodo();
	}

}