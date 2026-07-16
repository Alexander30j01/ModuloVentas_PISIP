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
	
	@Override
	public Usuarios iniciarSesion(int idUsuario) {

	    return repositorio.iniciarSesion(idUsuario);

	}
	
	@Override
	public Usuarios cerrarSesion(int idUsuario) {

	    return repositorio.cerrarSesion(idUsuario);

	}
	
	@Override
	public Usuarios actualizarPerfil(int idUsuario, Usuarios usuario) {

	    return repositorio.actualizarPerfil(idUsuario, usuario);

	}
	
	@Override
	public Usuarios cambiarContrasena(int idUsuario, String nuevaContrasena) {

	    return repositorio.cambiarContrasena(idUsuario, nuevaContrasena);

	}
	@Override
	public Usuarios asignarRol(int idUsuario, String rol) {

	    return repositorio.asignarRol(idUsuario, rol);

	}
	@Override
	public Usuarios asignarRegion(int idUsuario, String region) {

	    return repositorio.asignarRegion(idUsuario, region);

	}
	@Override
	public Usuarios activar(int idUsuario) {

	    return repositorio.activar(idUsuario);

	}
	
	@Override
	public Usuarios desactivar(int idUsuario) {

	    return repositorio.desactivar(idUsuario);

	}
	
	@Override
	public Usuarios generarReporteVisitas(int idUsuario) {

	    return repositorio.generarReporteVisitas(idUsuario);

	}

}
