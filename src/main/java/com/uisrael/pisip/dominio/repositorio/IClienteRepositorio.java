package com.uisrael.pisip.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Cliente;

public interface IClienteRepositorio {

	Cliente guardar(Cliente nuevoclientes);

	Optional<Cliente> buscarPorId(int idClientes);

	List<Cliente> listarTodo();

	void eliminar(int idClientes);

}
