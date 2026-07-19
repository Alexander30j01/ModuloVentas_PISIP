package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IRolUseCase;
import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.dominio.repositorio.IRolRepositorio;

public class RolUseCaseImpl implements IRolUseCase {

    private final IRolRepositorio repositorio;

    public RolUseCaseImpl(IRolRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Rol registrar(Rol rol) {
        rol.setEstado(true); // Por defecto activo, siguiendo el estándar de Producto
        return repositorio.guardar(rol);
    }

    @Override
    public Rol actualizar(Rol rol) {
        return repositorio.guardar(rol);
    }

    @Override
    public void agregarPermiso(int idRol, int idPermiso) {
        Rol rol = repositorio.buscarPorId(idRol)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        
        // Aquí integras la lógica de tu entidad Rol. Por ejemplo:
        // rol.getPermisos().add(idPermiso); 
        
        repositorio.guardar(rol);
    }

    @Override
    public void quitarPermiso(int idRol, int idPermiso) {
        Rol rol = repositorio.buscarPorId(idRol)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        
        // Aquí integras la lógica de tu entidad Rol para remover. Por ejemplo:
        // rol.getPermisos().remove(Integer.valueOf(idPermiso)); 
        
        repositorio.guardar(rol);
    }

    @Override
    public void activar(int id) {
        Rol rol = repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        rol.setEstado(true);
        repositorio.guardar(rol);
    }

    @Override
    public void desactivar(int id) {
        Rol rol = repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        rol.setEstado(false);
        repositorio.guardar(rol);
    }
}