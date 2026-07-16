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

    @Override
    public Visita registrarIngreso(int idVisita) {

        return repositorio.registrarIngreso(idVisita);

    }
    
    @Override
    public Visita registrarSalida(int idVisita) {

        return repositorio.registrarSalida(idVisita);

    }
    
    @Override
    public Visita registrarUbicacion(int idVisita, double latitud, double longitud) {

        return repositorio.registrarUbicacion(idVisita, latitud, longitud);

    }
    
    @Override
    public long calcularTiempoVisita(int idVisita) {

        return repositorio.calcularTiempoVisita(idVisita);

    }
    
    @Override
    public Visita agregarObservacion(int idVisita, String observacion) {

        return repositorio.agregarObservacion(idVisita, observacion);

    }
}
