package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Permiso;

public interface IPermisoRepositorio {
	
	Optional<Permiso> obtenerPorId(int idPermiso);
	
	Permiso guardar(Permiso permiso);

	List<Permiso> listarTodos();

}
