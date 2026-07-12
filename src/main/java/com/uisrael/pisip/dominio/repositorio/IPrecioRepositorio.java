package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Precio;

public interface IPrecioRepositorio {
	
	Precio guardar(Precio nuevoprecios);

	Optional<Precio> buscarPorId(int idPrecio);

	List<Precio> listarTodo();

	void eliminar(int idPrecio);

}
