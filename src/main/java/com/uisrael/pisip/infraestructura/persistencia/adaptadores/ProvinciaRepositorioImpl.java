package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.repositorio.IProvinciaRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProvinciaJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IProvinciaJpaRepositorio;

@Repository
public class ProvinciaRepositorioImpl implements IProvinciaRepositorio {

	private final IProvinciaJpaRepositorio jpaRepositorio;
	private final IProvinciaJpaMapper entityMapper;

	public ProvinciaRepositorioImpl(IProvinciaJpaRepositorio jpaRepositorio, IProvinciaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Provincia guardar(Provincia provincia) {
	var provinciaJpa = entityMapper.toEntity(provincia);
	var provinciaGuardarJpa = jpaRepositorio.save(provinciaJpa);

		return entityMapper.toDominio(provinciaGuardarJpa);
	}

	@Override
	public Provincia actualizar(Provincia provincia) {
		return guardar(provincia);
	}

	@Override
	public Provincia registrar(Provincia provincia) {
		var provinciaJpa = entityMapper.toEntity(provincia);
		var provinciaGuardarJpa = jpaRepositorio.save(provinciaJpa);

		return entityMapper.toDominio(provinciaGuardarJpa);
	}

	@Override
	public Provincia buscarPorNombre(String nombre) {
		Optional<ProvinciaEntity> provinciaOptional = jpaRepositorio.findByNombre(nombre);
		if (provinciaOptional.isPresent()) {
			return entityMapper.toDominio(provinciaOptional.get());
		} else {
			return null;
		}
	}

	@Override
	public Provincia obtenerPorId(Integer idProvincia) {
		Optional<ProvinciaEntity> provinciaOptional = jpaRepositorio.findById(idProvincia);
		if (provinciaOptional.isPresent()) {
			return entityMapper.toDominio(provinciaOptional.get());
		} else {
			return null;
		}
	}

	@Override
	public void cambiarEstado(Provincia provincia, boolean activo) {
		
		var provinciaOptional = jpaRepositorio.findById(provincia.getIdProvincia());
		provinciaOptional.ifPresent(provinciaJpa -> {
			provinciaJpa.setEstado(activo);
			jpaRepositorio.save(provinciaJpa);
		});
		
	}

	@Override
	public List<Provincia> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

}
