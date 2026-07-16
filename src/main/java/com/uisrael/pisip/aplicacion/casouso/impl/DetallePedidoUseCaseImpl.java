package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;

public class DetallePedidoUseCaseImpl implements IDetallePedidoUseCase {

	private final IDetallePedidoRepositorio repositorio;

	public DetallePedidoUseCaseImpl(IDetallePedidoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public DetallePedido guardar(DetallePedido detallePedido) {
		return repositorio.guardar(detallePedido);
	}

	@Override
	public DetallePedido buscarPorId(int idDetallePedido) {
		return repositorio.buscarPorId(idDetallePedido).orElseThrow(
				() -> new RuntimeException("No se encontro el detalle de pedido con ID: " + idDetallePedido));
	}

	@Override
	public List<DetallePedido> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void cambiarEstado(DetallePedido detallePedido, boolean aprobado) {
		repositorio.cambiarEstado(detallePedido, aprobado);
	}

}
