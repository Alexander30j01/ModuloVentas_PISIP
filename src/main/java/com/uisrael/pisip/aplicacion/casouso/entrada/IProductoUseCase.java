package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Producto;

/*import java.util.List;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoUseCase {
	
	Producto guardar(Producto nuevaProducto);

	Producto buscarPorId(int idProducto);

	List<Producto> listarTodos();

	void eliminar(int idProducto);

}*/

public interface IProductoUseCase {
    Producto registrar(Producto producto);
    Producto actualizar(Producto producto);
    void aumentarStock(int id, int cantidad);
    void disminuirStock(int id, int cantidad);
    float consultarPrecio(int id);
    void activar(int id);
    void desactivar(int id);
}
