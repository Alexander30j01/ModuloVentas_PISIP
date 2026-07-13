package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoRepositorio {
	
	Producto guardar(Producto nuevoproducto);

	Optional<Producto> buscarPorId(int idProducto);

	List<Producto> listarTodo();

	void eliminar(int idProducto);
	void actualizar(Producto producto);

}
