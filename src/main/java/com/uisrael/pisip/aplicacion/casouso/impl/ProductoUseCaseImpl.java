package com.uisrael.pisip.aplicacion.casouso.impl;

import org.springframework.stereotype.Service;
import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;

@Service
public class ProductoUseCaseImpl implements IProductoUseCase {

	private final IProductoRepositorio repositorio;

	public ProductoUseCaseImpl(IProductoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Producto registrar(Producto producto) {
		if (producto.getNombreProductos() == null || producto.getNombreProductos().isEmpty()) {
			throw new IllegalArgumentException("El nombre del producto es obligatorio.");
		}
		return repositorio.registrar(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return repositorio.actualizar(producto);
	}

	@Override
	public void aumentarStock(int id, int cantidad) {
		Producto producto = repositorio.buscarPorId(id);
		if (producto == null)
			throw new RuntimeException("Producto no encontrado");
		producto.setStock(producto.getStock() + cantidad);
		repositorio.actualizarStock(id, producto.getStock());
	}

	@Override
	public void disminuirStock(int id, int cantidad) {
		Producto producto = repositorio.buscarPorId(id);
		if (producto == null)
			throw new RuntimeException("Producto no encontrado");

		// Regla de negocio: Validar stock suficiente
		if (producto.getStock() < cantidad) {
			throw new IllegalStateException("Stock insuficiente para la venta.");
		}
		producto.setStock(producto.getStock() - cantidad);
		repositorio.actualizarStock(id, producto.getStock());
	}

	@Override
	public float consultarPrecio(int id) {
		return (float) repositorio.consultarPrecioActual(id);
	}

	@Override
	public void activar(int id) {
		repositorio.cambiarEstado(id, true);
    }

	@Override
	public void desactivar(int id) {
		repositorio.cambiarEstado(id, false);

	}

}