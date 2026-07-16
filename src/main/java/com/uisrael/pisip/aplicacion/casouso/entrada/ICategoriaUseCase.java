package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Categoria;

public interface ICategoriaUseCase {

	Categoria registrar(Categoria categoria);

	Categoria actualizar(Categoria categoria);

	void cambiarEstado(Categoria categoria, boolean activo);

}
