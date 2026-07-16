package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;

public class ClienteUseCaseImpl implements IClienteUseCase {

	private final IClienteRepositorio repositorio;

	public ClienteUseCaseImpl(IClienteRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Cliente registrar(Cliente cliente) {
		return repositorio.registrar(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		return repositorio.actualizar(cliente);
	}

	@Override
	public boolean solicitarCredito(int idCliente, double monto) {
		return repositorio.solicitarCredito(idCliente, monto);
	}

	@Override
	public boolean tieneCreditoAprobado(int idCliente) {
		return repositorio.tieneCreditoAprobado(idCliente);
	}

	@Override
	public List<Pedidos> consultarHistorial(int idCliente) {
		return repositorio.consultarHistorial(idCliente);
	}

	@Override
	public void cambiarEstado(Cliente cliente, boolean activo) {
		repositorio.cambiarEstado(cliente, activo);
	}

}
