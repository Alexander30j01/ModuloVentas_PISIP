package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;

public class PedidosUseCaseImpl implements IPedidosUseCase {
	
	private final IPedidosRepositorio repositorio;
	
	

	public PedidosUseCaseImpl(IPedidosRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Pedidos guardar(Pedidos nuevaPedidos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos buscarPorId(int idPedidos) {
		return repositorio.buscarPorId(idPedidos).orElseThrow(()->new
				RuntimeException("Peidido no encontrado"));
	}

	@Override
	public List<Pedidos> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idPedidos) {
		// TODO Auto-generated method stub
		
	}

}
