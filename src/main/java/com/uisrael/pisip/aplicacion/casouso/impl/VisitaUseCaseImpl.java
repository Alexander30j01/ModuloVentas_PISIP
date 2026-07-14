package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IVisitaUseCase;
import com.uisrael.pisip.dominio.entidades.Visita;
import com.uisrael.pisip.dominio.repositorio.IVisitaRepositorio;

public class VisitaUseCaseImpl implements IVisitaUseCase {

    private final IVisitaRepositorio repositorio;

    public VisitaUseCaseImpl(IVisitaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Visita guardar(Visita nuevaVisita) {
        return repositorio.guardar(nuevaVisita);
    }

    @Override
    public Visita buscarPorId(int idVisita) {
        return repositorio.buscarPorId(idVisita)
                .orElseThrow(() -> new RuntimeException("Visita no encontrada"));
    }

    @Override
    public List<Visita> listarTodos() {
        return repositorio.listarTodo();
    }

    @Override
    public void eliminar(int idVisita) {
        repositorio.eliminar(idVisita);
    }

}
