package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.dominio.entidades.Usuarios;

public interface IProvinciaUseCase {
	Provincia guardar(Provincia provincia);
	
	Provincia registrar(Provincia provincia);

	Provincia actualizar(Provincia provincia);

	Provincia asignarVendedor(Integer idProvincia, Usuarios usuarios);

	Provincia removerVendedor(Integer idProvincia, Usuarios usuarios);

	Provincia buscarPorNombre(String nombre);

	Provincia obtenerPorId(Integer idProvincia);

	void cambiarEstado(Provincia provincia, boolean activo);

	List<Provincia> listarTodo();
}
