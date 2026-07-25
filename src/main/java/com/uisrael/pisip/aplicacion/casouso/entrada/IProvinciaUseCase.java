package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IProvinciaUseCase {
    Provincia registrar(Provincia provincia);
    Producto actualizar(Producto producto);
    void activar(int id);
    void desactivar(int id);
    void asignarVendedor(Usuarios usuarios);
    void removerVendedor(Usuarios usuarios);
}
