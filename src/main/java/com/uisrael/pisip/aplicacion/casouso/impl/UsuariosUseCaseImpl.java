package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IUsuariosUseCase;
import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;

public class UsuariosUseCaseImpl implements IUsuariosUseCase{
	
	private final IUsuariosRepositorio repositorio;
	

	public UsuariosUseCaseImpl(IUsuariosRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Usuarios guardar(Usuarios nuevaUsuarios) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios buscarPorId(int idUsuarios) {
		return repositorio.buscarPorId(idUsuarios).orElseThrow(()->new
				RuntimeException("Usuario no encontrado"));
	}

	@Override
	public List<Usuarios> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idUsuarios) {
		// TODO Auto-generated method stub
		
	}

}
