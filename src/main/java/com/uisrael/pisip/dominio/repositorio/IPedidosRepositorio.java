package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Pedidos;

public interface IPedidosRepositorio {
	
	Pedidos guardar(Pedidos nuevopedidos);

	Optional<Pedidos> buscarPorId(int idPedidos);

	List<Pedidos> listarTodo();

	void eliminar(int idPedidos);

}
