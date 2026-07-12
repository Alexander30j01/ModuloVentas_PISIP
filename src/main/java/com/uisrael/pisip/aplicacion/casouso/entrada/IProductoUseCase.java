package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoUseCase {
	
	Producto guardar(Producto nuevaProducto);

	Producto buscarPorId(int idProducto);

	List<Producto> listarTodos();

	void eliminar(int idProducto);

}
