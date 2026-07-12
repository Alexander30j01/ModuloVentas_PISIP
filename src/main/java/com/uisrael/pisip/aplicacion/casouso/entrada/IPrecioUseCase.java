package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Precio;

public interface IPrecioUseCase {
	
	Precio guardar(Precio nuevaPrecio);

	Precio buscarPorId(int idPrecio);

	List<Precio> listarTodos();

	void eliminar(int idPrecio);

}
