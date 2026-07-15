package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Visita;
import com.uisrael.pisip.dominio.repositorio.IVisitaRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.VisitaEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IVisitaJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IVisitaJpaRepositorio;

public class VisitaRepositorioImpl implements IVisitaRepositorio {

    private final IVisitaJpaRepositorio jpaRepositorio;
    private final IVisitaJpaMapper entityMapper;

    public VisitaRepositorioImpl(IVisitaJpaRepositorio jpaRepositorio,
            IVisitaJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Visita guardar(Visita nuevaVisita) {
        VisitaEntity entidad = entityMapper.toEntity(nuevaVisita);
        VisitaEntity guardado = jpaRepositorio.save(entidad);
        return entityMapper.toDominio(guardado);
    }

    @Override
    public Optional<Visita> buscarPorId(int idVisita) {
        return jpaRepositorio.findById(idVisita)
                .map(entityMapper::toDominio);
    }

    @Override
    public List<Visita> listarTodo() {
        return jpaRepositorio.findAll()
                .stream()
                .map(entityMapper::toDominio)
                .toList();
    }

    @Override
    public void eliminar(int idVisita) {
        jpaRepositorio.deleteById(idVisita);
    }
}
