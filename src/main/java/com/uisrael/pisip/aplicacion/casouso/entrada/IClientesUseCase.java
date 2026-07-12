package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Cliente;

public interface IClientesUseCase {
	
	Cliente guardar(Cliente nuevaClientes);

	Cliente buscarPorId(int idClientes);

	List<Cliente> listarTodos();

	void eliminar(int idClientes);


}
