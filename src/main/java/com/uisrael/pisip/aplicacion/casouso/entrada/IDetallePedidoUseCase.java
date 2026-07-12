package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.DetallePedido;

public interface IDetallePedidoUseCase {
	
	DetallePedido guardar(DetallePedido nuevaDetallePedido);

	DetallePedido buscarPorId(int idDetallePedido);

	List<DetallePedido> listarTodos();

	void eliminar(int idDetallePedido);

}
