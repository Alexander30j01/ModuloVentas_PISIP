package com.uisrael.pisip.dominio.repositorio;

import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Pedidos;

public interface IPedidosRepositorio {

	Pedidos guardar(Pedidos pedido);

	Optional<Pedidos> buscarPorId(int idPedido);

	void eliminar(int idPedido);
}
