package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IUsuariosRepositorio {
	
	Usuarios guardar(Usuarios nuevousuarios);

	Optional<Usuarios> buscarPorId(int idUsuarios);

	List<Usuarios> listarTodo();

	void eliminar(int idUsuarios);
	
	Usuarios iniciarSesion(int idUsuario);
	
	Usuarios cerrarSesion(int idUsuario);
	
	Usuarios actualizarPerfil(int idUsuario, Usuarios usuario);
	
	Usuarios cambiarContrasena(int idUsuario, String nuevaContrasena);
	
	Usuarios asignarRol(int idUsuario, String rol);
	
	Usuarios asignarRegion(int idUsuario, String region);
	
	Usuarios activar(int idUsuario);
	
	Usuarios desactivar(int idUsuario);
	
	Usuarios generarReporteVisitas(int idUsuario);

}
