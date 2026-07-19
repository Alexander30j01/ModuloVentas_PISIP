package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.entidades.Pedidos;

import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;


public class PedidosUseCaseImpl implements IPedidosUseCase {

	private final IPedidosRepositorio repositorio;

	public PedidosUseCaseImpl(IPedidosRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}
	@Override
	public Pedidos crearPedido(Pedidos pedido) {
		pedido.setEstadoPedido("PENDIENTE");
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos agregarDetalle(int idPedido, DetallePedido detalle) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos eliminarDetalle(int idPedido, int idDetalle) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos calcularTotal(int idPedido) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		return repositorio.guardar(pedido);
	}

	@Override
	public boolean validarStock(int idPedido) {
		
		return true;
	}

	@Override
	public Pedidos aprobarPedido(int idPedido) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		pedido.setEstadoPedido("APROBADO"); 
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos rechazarPedido(int idPedido) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		pedido.setEstadoPedido("RECHAZADO"); 
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos cambiarEstado(int idPedido, String nuevoEstado) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		pedido.setEstadoPedido(nuevoEstado); 
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedidos finalizarPedido(int idPedido) {
		Pedidos pedido = repositorio.buscarPorId(idPedido).orElseThrow(
				() -> new RuntimeException("No se encontró el pedido con ID: " + idPedido));
		pedido.setEstadoPedido("FINALIZADO"); 
		return repositorio.guardar(pedido);
	}
}
