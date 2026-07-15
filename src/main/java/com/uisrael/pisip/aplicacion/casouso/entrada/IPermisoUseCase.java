package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Permiso;

public interface IPermisoUseCase {

	Permiso actualizarNombre(int idPermiso, String nuevoNombre);

	Permiso actualizarDescripcion(int idPermiso, String nuevaDescripcion);

	Permiso activar(int idPermiso);

	Permiso desactivar(int idPermiso);

}
