package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IUsuariosUseCase {
	
	
	Usuarios guardar(Usuarios nuevaUsuarios);

	Usuarios buscarPorId(int idUsuarios);

	List<Usuarios> listarTodos();

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
