package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.dominio.repositorio.IPrecioRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PrecioEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPrecioJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IPrecioJpaRepositorio;
@Repository
public class PrecioRepositorioImpl implements IPrecioRepositorio {

	private final IPrecioJpaRepositorio jpaRepository;
	private final IPrecioJpaMapper mapper;

	public PrecioRepositorioImpl(IPrecioJpaRepositorio jpaRepository, IPrecioJpaMapper mapper) {
		this.jpaRepository = jpaRepository;
		this.mapper = mapper;
	}

	@Override
	public Precio guardar(Precio nuevoprecios) {
		PrecioEntity entity = mapper.toEntity(nuevoprecios);
		PrecioEntity entityGuardada = jpaRepository.save(entity);
		return mapper.toDominio(entityGuardada);
	}

	@Override
	public Optional<Precio> buscarPorId(int idPrecio) {
		return jpaRepository.findById(idPrecio).map(mapper::toDominio);
	}

	@Override
	public List<Precio> listarTodo() {
		List<PrecioEntity> entidades = jpaRepository.findAll();
		return entidades.stream().map(mapper::toDominio).toList();
	}

	@Override
	public Precio obtenerPrecioActivo() {
		return jpaRepository.findByEstadoTrue().map(mapper::toDominio).orElse(null);
	}

}
