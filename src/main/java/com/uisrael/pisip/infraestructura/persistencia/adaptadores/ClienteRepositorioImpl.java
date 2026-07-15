package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.Collections;
import java.util.List;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IClienteJpaRepositorio;

public class ClienteRepositorioImpl implements IClienteRepositorio {

	private final IClienteJpaRepositorio jpaRepositorio;
	private final IClienteJpaMapper entityMapper;

	public ClienteRepositorioImpl(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Cliente registrar(Cliente cliente) {
		var clienteJpa = entityMapper.toEntity(cliente);
		var clienteGuardadoJpa = jpaRepositorio.save(clienteJpa);
		return entityMapper.toDominio(clienteGuardadoJpa);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		return registrar(cliente);
	}

	@Override
	public boolean solicitarCredito(int idCliente, double monto) {
		var clienteOptional = jpaRepositorio.findById(idCliente);
		if (clienteOptional.isPresent()) {
			var clienteJpa = clienteOptional.get();
			return clienteJpa.isEstado() && monto <= 500.0;
		}
		return false;
	}

	@Override
	public boolean tieneCreditoAprobado(int idCliente) {
		var clienteOptional = jpaRepositorio.findById(idCliente);
		if (clienteOptional.isPresent()) {
			var clienteJpa = clienteOptional.get();
			return clienteJpa.isEstado();
		}
		return false;
	}

	@Override
	public List<Pedidos> consultarHistorial(int idCliente) {
		return Collections.emptyList();
	}

	@Override
	public void cambiarEstado(Cliente cliente, boolean activo) {
		var clienteOptional = jpaRepositorio.findById(cliente.getIdCliente());
		clienteOptional.ifPresent(clienteJpa -> {
			clienteJpa.setEstado(activo);
			jpaRepositorio.save(clienteJpa);
		});

	}

}
