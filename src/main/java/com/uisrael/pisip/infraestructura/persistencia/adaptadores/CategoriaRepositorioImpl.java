package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import com.uisrael.pisip.dominio.entidades.Categoria;
import com.uisrael.pisip.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {

	private final ICategoriaJpaRepositorio jpaRepositorio;
	private final ICategoriaJpaMapper entityMapper;

	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Categoria registrar(Categoria categoria) {
		var categoriaJpa = entityMapper.toEntity(categoria);
		var categoriaGuardarJpa = jpaRepositorio.save(categoriaJpa);

		return entityMapper.toDomain(categoriaGuardarJpa);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		return registrar(categoria);
	}

	@Override
	public void cambiarEstado(Categoria categoria, boolean activo) {
		
		
		
	}

}
