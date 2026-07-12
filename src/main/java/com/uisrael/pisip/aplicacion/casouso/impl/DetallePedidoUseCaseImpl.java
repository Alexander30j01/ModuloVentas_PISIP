package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;

public class DetallePedidoUseCaseImpl implements IDetallePedidoUseCase{
	
	private final IDetallePedidoRepositorio repositorio;
	

	public DetallePedidoUseCaseImpl(IDetallePedidoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public DetallePedido guardar(DetallePedido nuevaDetallePedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetallePedido buscarPorId(int idDetallePedido) {
		return repositorio.buscarPorId(idDetallePedido).orElseThrow(()->new 
	RuntimeException("Detalle no encontrado"));
	}

	@Override
	public List<DetallePedido> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idDetallePedido) {
		// TODO Auto-generated method stub
		
	}

}
