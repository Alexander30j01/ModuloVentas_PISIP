package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Visita;

public interface IVisitaRepositorio {

    Visita guardar(Visita nuevaVisita);

    Optional<Visita> buscarPorId(int idVisita);

    List<Visita> listarTodo();

    void eliminar(int idVisita);

}
