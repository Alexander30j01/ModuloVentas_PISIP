package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IUsuariosUseCase {
	
	
	Usuarios guardar(Usuarios nuevaUsuarios);

	Usuarios buscarPorId(int idUsuarios);

	List<Usuarios> listarTodos();

	void eliminar(int idUsuarios);

}
