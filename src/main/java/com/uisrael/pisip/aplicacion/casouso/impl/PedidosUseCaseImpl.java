package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IPedidoRepositorio;

public class PedidosUseCaseImpl implements IPedidosUseCase {

	private final IPedidoRepositorio repositorio;

	public PedidosUseCaseImpl(IPedidoRepositorio repositorio){
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Pedido crearPedido(Cliente cliente, Usuarios vendedor, String metodoPago) {
		return repositorio.crerPedido(new Pedido(cliente,vendedor,metodoPago));
	}


}
