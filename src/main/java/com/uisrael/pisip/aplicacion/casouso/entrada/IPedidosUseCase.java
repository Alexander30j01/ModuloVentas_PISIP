package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IPedidosUseCase {
	
	Pedido crearPedido(Cliente cliente, Usuarios vendedor, String metodoPago);
	
}
