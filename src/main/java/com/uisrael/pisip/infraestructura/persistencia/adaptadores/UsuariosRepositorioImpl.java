package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.UsuariosEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IUsuariosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IUsuariosJpaRepositorio;

public class UsuarioRepositorioImpl implements IUsuariosRepositorio {
	
	private final IUsuariosJpaRepositorio jpaRepositorio;
	private final IUsuariosJpaMapper entityMapper;
	
	public UsuarioRepositorioImpl(IUsuariosJpaRepositorio jpaRepositorio, IUsuariosJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Usuarios guardar(Usuarios nuevousuarios) {
		UsuariosEntity entidad=entityMapper.toEntity(nuevousuarios);
		UsuariosEntity guardado=jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<Usuarios> buscarPorId(int idUsuarios) {
		return jpaRepositorio.findById(idUsuarios).map(entityMapper::toDominio);
	}

	@Override
	public List<Usuarios> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idUsuarios) {
		jpaRepositorio.deleteById(idUsuarios);
	}

}
