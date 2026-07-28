package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoUseCase {

	Producto registrar(Producto producto);

	Producto actualizar(Producto producto);

	Producto buscarPorId(int id);

	List<Producto> listarTodo();

	void eliminar(int id);

	void aumentarStock(int id, int cantidad);

	void disminuirStock(int id, int cantidad);

	float consultarPrecio(int id);

	void activar(int id);

	void desactivar(int id);
}
