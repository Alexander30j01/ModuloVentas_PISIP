package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.dominio.repositorio.IRolRepositorio;
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
    public Rol registrar(Rol rol) {
        var rolJpa = entityMapper.toEntity(rol);
        var rolGuardadoJpa = jpaRepositorio.save(rolJpa);
        return entityMapper.toDominio(rolGuardadoJpa);
    }

    @Override
    public Rol actualizar(Rol rol) {
        return registrar(rol); // Tal como lo haces en Cliente, delegamos a registrar()
    }

    @Override
    public void agregarPermiso(int idRol, int idPermiso) {
        var rolOptional = jpaRepositorio.findById(idRol);
        rolOptional.ifPresent(rolJpa -> {
            // Lógica de JPA para añadir el permiso (depende de tu entidad)
            // Ejemplo: rolJpa.getPermisos().add(permiso);
            jpaRepositorio.save(rolJpa);
        });
    }

    @Override
    public void quitarPermiso(int idRol, int idPermiso) {
        var rolOptional = jpaRepositorio.findById(idRol);
        rolOptional.ifPresent(rolJpa -> {
            // Lógica de JPA para quitar el permiso (depende de tu entidad)
            // Ejemplo: rolJpa.getPermisos().removeIf(p -> p.getId() == idPermiso);
            jpaRepositorio.save(rolJpa);
        });
    }

    @Override
    public void activar(int idRol) {
        var rolOptional = jpaRepositorio.findById(idRol);
        rolOptional.ifPresent(rolJpa -> {
            rolJpa.setEstado(true);
            jpaRepositorio.save(rolJpa);
        });
    }

    @Override
    public void desactivar(int idRol) {
        var rolOptional = jpaRepositorio.findById(idRol);
        rolOptional.ifPresent(rolJpa -> {
            rolJpa.setEstado(false);
            jpaRepositorio.save(rolJpa);
        });
    }

    @Override
    public Optional<Rol> buscarPorId(int idRol) {
        var rolOptional = jpaRepositorio.findById(idRol);
        if (rolOptional.isPresent()) {
            return Optional.of(entityMapper.toDominio(rolOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    public List<Rol> listarTodos() {
        var listaJpa = jpaRepositorio.findAll();
        return listaJpa.stream().map(entityMapper::toDominio).toList();
    }
}