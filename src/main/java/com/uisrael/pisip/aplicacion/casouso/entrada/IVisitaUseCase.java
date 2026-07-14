package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Visita;

public interface IVisitaUseCase {

    Visita guardar(Visita nuevaVisita);

    Visita buscarPorId(int idVisita);

    List<Visita> listarTodos();

    void eliminar(int idVisita);

}
