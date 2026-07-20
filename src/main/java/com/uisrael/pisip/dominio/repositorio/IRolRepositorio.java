package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Rol;

public interface IRolRepositorio {

    Rol registrar(Rol rol);

    Rol actualizar(Rol rol);

    void agregarPermiso(int idRol, int idPermiso);

    void quitarPermiso(int idRol, int idPermiso);

    void activar(int idRol);

    void desactivar(int idRol);

    // Métodos de consulta necesarios para el funcionamiento del sistema
    Optional<Rol> buscarPorId(int idRol);

    List<Rol> listarTodos();


}