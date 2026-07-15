package com.uisrael.pisip.dominio.repositorio;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoRepositorio {

	Producto registrar(Producto nuevoproducto);
	Producto actualizar(Producto nuevoproducto);
	void cambiarEstado(int idProducto, boolean estado);
	void actualizarStock(int idProducto, int stock);
	double consultarPrecioActual(int idProducto);
	Producto buscarPorId(int idProducto);
	List<Producto> listarTodos();

}
