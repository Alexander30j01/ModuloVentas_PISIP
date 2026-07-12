package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.DetallePedido;

public interface IDetallePedidoRepositorio {
	
	DetallePedido guardar(DetallePedido nuevodetallePedido);

	Optional<DetallePedido> buscarPorId(int idDetallePedido);

	List<DetallePedido> listarTodo();

	void eliminar(int idDetallePedido);

}
