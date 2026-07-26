package com.uisrael.pisip.dominio.repositorio;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Pedido;

public interface IPedidoRepositorio {

	Pedido crearPedido(Pedido pedido);

	List<Pedido> listarPedido();

	Pedido buscarPorId(int idPedidos);

	Pedido actualizarPedido(Pedido pedido);

}
