package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPermisoUseCase;
import com.uisrael.pisip.dominio.entidades.Permiso;
import com.uisrael.pisip.dominio.repositorio.IPermisoRepositorio;

public class PermisoUseCaseImpl implements IPermisoUseCase {

	private final IPermisoRepositorio repositorio;

	public PermisoUseCaseImpl(IPermisoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Permiso registrar(Permiso permiso) {
		permiso.setEstado(true);
		return repositorio.guardar(permiso);
	}

	@Override
	public Permiso buscarPorId(int idPermiso) {
		return repositorio.obtenerPorId(idPermiso)
				.orElseThrow(() -> new RuntimeException("No existe el permiso con ID: " + idPermiso));
	}

	@Override
	public List<Permiso> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public Permiso actualizarNombre(int idPermiso, String nuevoNombre) {
		Permiso permiso = repositorio.obtenerPorId(idPermiso)
				.orElseThrow(() -> new RuntimeException("No existe el permiso con ID: " + idPermiso));
		permiso.setNombre(nuevoNombre);
		return repositorio.guardar(permiso);
	}

	@Override
	public Permiso actualizarDescripcion(int idPermiso, String nuevaDescripcion) {
		Permiso permiso = repositorio.obtenerPorId(idPermiso)
				.orElseThrow(() -> new RuntimeException("No existe el permiso con ID: " + idPermiso));
		permiso.setDescripcion(nuevaDescripcion);
		return repositorio.guardar(permiso);
	}

	@Override
	public Permiso activar(int idPermiso) {
		Permiso permiso = repositorio.obtenerPorId(idPermiso)
				.orElseThrow(() -> new RuntimeException("No existe el permiso con ID: " + idPermiso));
		permiso.setEstado(true);
		return repositorio.guardar(permiso);
	}

	@Override
	public Permiso desactivar(int idPermiso) {
		Permiso permiso = repositorio.obtenerPorId(idPermiso)
				.orElseThrow(() -> new RuntimeException("No existe el permiso con ID: " + idPermiso));
		permiso.setEstado(false);
		return repositorio.guardar(permiso);
	}

}
