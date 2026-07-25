package com.uisrael.pisip.dominio.repositorio;

import com.uisrael.pisip.dominio.entidades.Provincia;

public interface IProvinciaRepositorio {
	Provincia guardar(Provincia provincia);

	Provincia actualizar(Provincia provincia);

	Provincia registrar(Provincia provincia);
	
	Provincia buscarPorNombre(String nombre);
	
	Provincia obtenerPorId(Integer id);
	
	void cambiarEstado(Provincia provincia, boolean activo);
	
	

}
