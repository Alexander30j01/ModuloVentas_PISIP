package com.uisrael.pisip.aplicacion.casouso.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.dominio.repositorio.IPedidoRepositorio;

public class PedidosUseCaseImpl implements IPedidosUseCase {

	private final IPedidoRepositorio repositorio;

	public PedidosUseCaseImpl(IPedidoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Pedido crearPedido(Pedido pedido) {
		BigDecimal total = calcularTotalInterno(pedido);
		pedido.setSubtotal(total);
		pedido.setTotalFinal(total);
		return repositorio.crearPedido(pedido);
	}

	@Override
	public List<Pedido> listarPedido() {
		return repositorio.listarPedido();
	}

	@Override
	public Pedido agregarDetalle(int idPedido, DetallePedido detalle) {
		Pedido pedido = obtenerPedido(idPedido);

		if (pedido.getDetalles() == null) {
			pedido.setDetalles(new ArrayList<>());
		}
		pedido.getDetalles().add(detalle);
		BigDecimal total = calcularTotalInterno(pedido);
		pedido.setSubtotal(total);
		pedido.setTotalFinal(total);

		return repositorio.actualizarPedido(pedido);
	}

	@Override
	public BigDecimal calcularTotal(int idPedido) {
		Pedido pedido = obtenerPedido(idPedido);
		BigDecimal total = calcularTotalInterno(pedido);
		pedido.setSubtotal(total);
		pedido.setTotalFinal(total);
		repositorio.actualizarPedido(pedido);
		return total;
	}

	@Override
	public boolean validarStock(int idPedido) {
		Pedido pedido = obtenerPedido(idPedido);
		if (pedido.getDetalles() == null || pedido.getDetalles().isEmpty()) {
			return false;
		}
		for (DetallePedido detalle : pedido.getDetalles()) {
			if (detalle.getProducto() == null || detalle.getProducto().getStock() < detalle.getCantidad()) {
				return false;
			}
		}
		return true;
	}

	private Pedido obtenerPedido(int idPedido) {
		Pedido pedido = repositorio.buscarPorId(idPedido);
		if (pedido == null) {
			throw new RuntimeException("No se encontró el pedido con ID: " + idPedido);
		}
		return pedido;
	}

	private BigDecimal calcularTotalInterno(Pedido pedido) {
		BigDecimal total = BigDecimal.ZERO;
		if (pedido.getDetalles() != null) {
			for (DetallePedido detalle : pedido.getDetalles()) {
				BigDecimal subtotalDetalle = BigDecimal.valueOf(detalle.getSubTotal());
				total = total.add(subtotalDetalle);
			}
		}
		return total;
	}

}
