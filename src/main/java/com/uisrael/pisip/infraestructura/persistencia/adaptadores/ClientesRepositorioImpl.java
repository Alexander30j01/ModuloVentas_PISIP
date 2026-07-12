package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ClientesEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IClientesJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IClientesJpaRepositorio;

public class ClientesRepositorioImpl implements IClienteRepositorio {

	private final IClientesJpaRepositorio jpaRepositorio;
	private final IClientesJpaMapper entityMapper;

	public ClientesRepositorioImpl(IClientesJpaRepositorio jpaRepositorio, IClientesJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Cliente guardar(Cliente nuevoclientes) {
		ClientesEntity entidad = entityMapper.toEntity(nuevoclientes);
		ClientesEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<Cliente> buscarPorId(int idClientes) {
		return jpaRepositorio.findById(idClientes).map(entityMapper::toDominio);
	}

	@Override
	public List<Cliente> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idClientes) {
		jpaRepositorio.deleteById(idClientes);
	}

}
