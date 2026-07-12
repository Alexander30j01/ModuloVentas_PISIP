package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IClientesUseCase;
import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;

public class ClientesUseCaseImpl implements IClientesUseCase {

	private final IClienteRepositorio repositorio;

	public ClientesUseCaseImpl(IClienteRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Cliente guardar(Cliente nuevaClientes) {
		return null;
	}

	@Override
	public Cliente buscarPorId(int idClientes) {
		return repositorio.buscarPorId(idClientes).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Cliente> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idClientes) {
		// TODO Auto-generated method stub

	}

}
