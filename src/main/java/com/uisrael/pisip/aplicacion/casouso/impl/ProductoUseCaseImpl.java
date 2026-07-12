package com.uisrael.pisip.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;

public class ProductoUseCaseImpl implements IProductoUseCase  {
	
	private final IProductoRepositorio repositorio;
	

	public ProductoUseCaseImpl(IProductoRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Producto guardar(Producto nuevaProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto buscarPorId(int idProducto) {
		return repositorio.buscarPorId(idProducto).orElseThrow(()->new
				RuntimeException("Producto no encontrado"));
	}

	@Override
	public List<Producto> listarTodos() {
		return repositorio.listarTodo();
	}

	@Override
	public void eliminar(int idProducto) {
		// TODO Auto-generated method stub
		
	}

}
