package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Rol;

public interface IRolUseCase {
    Rol registrar(Rol rol);
    Rol actualizar(Rol rol);
    void agregarPermiso(int idRol, int idPermiso);
    void quitarPermiso(int idRol, int idPermiso);
    void activar(int id);
    void desactivar(int id);
}
