package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.uisrael.pisip.aplicacion.casouso.entrada.IRolUseCase;
import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.dominio.repositorio.IRolRepositorio;
@Service
public class RolUseCaseImpl implements IRolUseCase {

    private final IRolRepositorio repositorio;

    public RolUseCaseImpl(IRolRepositorio repositorio) {
        super();
        this.repositorio = repositorio;
    }

    @Override
    public Rol registrar(Rol rol) {
        return repositorio.registrar(rol);
    }

    @Override
    public Rol actualizar(Rol rol) {
        return repositorio.actualizar(rol);
    }

    @Override
    public void agregarPermiso(int idRol, int idPermiso) {
        repositorio.agregarPermiso(idRol, idPermiso);
    }

    @Override
    public void quitarPermiso(int idRol, int idPermiso) {
        repositorio.quitarPermiso(idRol, idPermiso);
    }

    @Override
    public void activar(int id) {
        repositorio.activar(id);
    }

    @Override
    public void desactivar(int id) {
        repositorio.desactivar(id);
    }

    @Override
    public Optional<Rol> buscarPorId(int idRol) {
        return repositorio.buscarPorId(idRol);
    }

    @Override
    public List<Rol> listarTodos() {
        return repositorio.listarTodos();
    }

}