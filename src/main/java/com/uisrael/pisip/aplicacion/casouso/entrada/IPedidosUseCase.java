package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.entidades.Pedidos;

public interface IPedidosUseCase {
	
	Pedidos crearPedido(Pedidos pedido);

	Pedidos agregarDetalle(int idPedido, DetallePedido detalle);

	Pedidos eliminarDetalle(int idPedido, int idDetalle);

	Pedidos calcularTotal(int idPedido);

	boolean validarStock(int idPedido);

	Pedidos aprobarPedido(int idPedido);

	Pedidos rechazarPedido(int idPedido);

	Pedidos cambiarEstado(int idPedido, String nuevoEstado);

	Pedidos finalizarPedido(int idPedido);
}
