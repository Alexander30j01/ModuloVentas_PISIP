package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedidos;

public interface IClienteUseCase {
	Cliente registrar(Cliente cliente);

	Cliente actualizar(Cliente cliente);

	boolean solicitarCredito(int idCliente, double monto);

	boolean tieneCreditoAprobado(int idCliente);

	List<Pedidos> consultarHistorial(int idCliente);

	void cambiarEstado(Cliente cliente, boolean activo);

}
