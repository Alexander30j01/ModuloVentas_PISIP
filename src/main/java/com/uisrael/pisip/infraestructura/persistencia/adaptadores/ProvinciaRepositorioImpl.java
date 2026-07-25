package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.repositorio.IProvinciaRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProvinciaJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IProvinciaJpaRepositorio;

public class ProvinciaRepositorioImpl implements IProvinciaRepositorio {

	private final IProvinciaJpaRepositorio jpaRepositorio;
	private final IProvinciaJpaMapper entityMapper;

	public ProvinciaRepositorioImpl(IProvinciaJpaRepositorio jpaRepositorio, IProvinciaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Provincia guardar(Provincia nuevaProvincia) {
		ProvinciaEntity entidad = entityMapper.toEntity(nuevaProvincia);
		ProvinciaEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<Provincia> buscarPorId(int idProvincia) {
		return jpaRepositorio.findById(idProvincia).map(entityMapper::toDominio);
	}

}
