package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Producto;

public interface IProductoUseCase {
    Producto registrar(Producto producto);
    Producto actualizar(Producto producto);
    void aumentarStock(int id, int cantidad);
    void disminuirStock(int id, int cantidad);
    float consultarPrecio(int id);
    void activar(int id);
    void desactivar(int id);
    
}
