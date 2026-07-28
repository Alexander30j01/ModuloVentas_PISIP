package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.math.BigDecimal;
import java.util.List;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.entidades.Pedido;

public interface IPedidosUseCase {
	
	Pedido crearPedido(Pedido pedido);

    List<Pedido> listarPedido();

    Pedido buscarPorId(int idPedido);

    Pedido actualizar(Pedido pedido);

    Pedido agregarDetalle(int idPedido, DetallePedido detalle);

    BigDecimal calcularTotal(int idPedido);

    boolean validarStock(int idPedido);

	
}
