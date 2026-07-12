package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IUsuariosRepositorio {
	
	Usuarios guardar(Usuarios nuevousuarios);

	Optional<Usuarios> buscarPorId(int idUsuarios);

	List<Usuarios> listarTodo();

	void eliminar(int idUsuarios);

}
