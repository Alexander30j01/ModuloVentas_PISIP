package com.uisrael.pisip.dominio.repositorio;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedido;

public interface IClienteRepositorio {

	Cliente registrar(Cliente cliente);

	Cliente actualizar(Cliente cliente);

	boolean solicitarCredito(int idCliente, double monto);

	boolean tieneCreditoAprobado(int idCliente);

	List<Pedido> consultarHistorial(int idCliente);

	void cambiarEstado(Cliente cliente, boolean activo);

	List<Cliente> listarTodos();

}
