package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Pedidos;

public interface IPedidosUseCase {
	
	Pedidos guardar(Pedidos nuevaPedidos);

	Pedidos buscarPorId(int idPedidos);

	List<Pedidos> listarTodos();

	void eliminar(int idPedidos);

}
