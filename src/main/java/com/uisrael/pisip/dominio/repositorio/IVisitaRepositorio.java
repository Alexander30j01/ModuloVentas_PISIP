package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Visita;

public interface IVisitaRepositorio {

    Visita guardar(Visita nuevaVisita);

    Optional<Visita> buscarPorId(int idVisita);

    List<Visita> listarTodo();

    void eliminar(int idVisita);
    
    Visita registrarIngreso(int idVisita);
    
    Visita registrarSalida(int idVisita);
    
    Visita registrarUbicacion(int idVisita, double latitud, double longitud);
    
    long calcularTiempoVisita(int idVisita);
    
    Visita agregarObservacion(int idVisita, String observacion);

}
