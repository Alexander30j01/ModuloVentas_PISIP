package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Permiso;
import com.uisrael.pisip.dominio.repositorio.IPermisoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PermisoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPermisoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IPermisosJpaRepositorio;

public class PermisoRepositorioImpl implements IPermisoRepositorio {

	private final IPermisosJpaRepositorio jpaRepositorio;
	private final IPermisoJpaMapper entityMapper;

	public PermisoRepositorioImpl(IPermisosJpaRepositorio jpaRepositorio, IPermisoJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Optional<Permiso> obtenerPorId(int idPermiso) {
		return jpaRepositorio.findById(idPermiso).map(entityMapper::toDomain);
	}

	@Override
	public Permiso guardar(Permiso permiso) {
		PermisoEntity entidad = entityMapper.toEntity(permiso);
		PermisoEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDomain(guardado);
	}

}
