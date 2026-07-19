package com.uisrael.pisip.dominio.repositorio;

import com.uisrael.pisip.dominio.entidades.Categoria;

public interface ICategoriaRepositorio {

	Categoria registrar(Categoria categoria);

	Categoria actualizar(Categoria categoria);

	void cambiarEstado(Categoria categoria, boolean activo);

}
