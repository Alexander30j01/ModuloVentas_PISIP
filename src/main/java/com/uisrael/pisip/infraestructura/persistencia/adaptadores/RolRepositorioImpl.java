package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.dominio.repositorio.IRolRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RolEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IRolJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IRolJpaRepositorio;

@Component
public class RolRepositorioImpl implements IRolRepositorio {

    private final IRolJpaRepositorio jpaRepositorio;
    private final IRolJpaMapper entityMapper;

    public RolRepositorioImpl(IRolJpaRepositorio jpaRepositorio, IRolJpaMapper entityMapper) {
        super();
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Rol guardar(Rol nuevoRol) {
        // Convierte el Dominio puro a Entidad JPA
        RolEntity entidad = entityMapper.toEntity(nuevoRol);
        // Guarda en la base de datos
        RolEntity guardado = jpaRepositorio.save(entidad);
        // Convierte la Entidad JPA de vuelta a Dominio puro y lo retorna
        return entityMapper.toDominio(guardado);
    }

    @Override
    public Optional<Rol> buscarPorId(int idRol) {
        // Busca en la base de datos y, si existe, lo mapea directamente a Dominio
        return jpaRepositorio.findById(idRol).map(entityMapper::toDominio);
    }

    @Override
    public List<Rol> listarTodos() {
        // Recupera todos, los convierte uno por uno a Dominio mediante un Stream, y los agrupa en una Lista
        return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
    }

    @Override
    public void eliminar(int idRol) {
        jpaRepositorio.deleteById(idRol);
    }
    
    @Override
    public void actualizar(Rol rol) {
        RolEntity entidad = entityMapper.toEntity(rol);
        jpaRepositorio.save(entidad); // JPA sabe que es un update si el ID ya existe
    }

}