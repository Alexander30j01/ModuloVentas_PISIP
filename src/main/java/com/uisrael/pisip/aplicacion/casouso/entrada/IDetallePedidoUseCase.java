package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.DetallePedido;

public interface IDetallePedidoUseCase {
	
	DetallePedido guardar(DetallePedido detallePedido);

	DetallePedido buscarPorId(int idDetallePedido);

	List<DetallePedido> listarTodos();

	void cambiarEstado(DetallePedido detallePedido, boolean aprobado);

}
