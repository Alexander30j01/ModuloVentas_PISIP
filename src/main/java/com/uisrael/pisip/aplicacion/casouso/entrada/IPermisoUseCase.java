package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Permiso;

public interface IPermisoUseCase {

	Permiso registrar(Permiso permiso);

	Permiso buscarPorId(int idPermiso);

	List<Permiso> listarTodos();

	Permiso actualizarNombre(int idPermiso, String nuevoNombre);

	Permiso actualizarDescripcion(int idPermiso, String nuevaDescripcion);

	Permiso activar(int idPermiso);

	Permiso desactivar(int idPermiso);

}
