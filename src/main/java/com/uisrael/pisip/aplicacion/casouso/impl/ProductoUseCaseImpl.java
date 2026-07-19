package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;


public class ProductoUseCaseImpl implements IProductoUseCase {

    private final IProductoRepositorio repositorio;

    public ProductoUseCaseImpl(IProductoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Producto registrar(Producto producto) {
        producto.setEstado(true); // Por defecto activo
        return repositorio.guardar(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return repositorio.guardar(producto);
    }

    @Override
    public void aumentarStock(int id, int cantidad) {
        Producto p = repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        p.setStock(p.getStock() + cantidad);
        repositorio.guardar(p);
    }

    @Override
    public void disminuirStock(int id, int cantidad) {
        Producto p = repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        if (p.getStock() < cantidad) throw new RuntimeException("Stock insuficiente");
        p.setStock(p.getStock() - cantidad);
        repositorio.guardar(p);
    }

    @Override
    public float consultarPrecio(int id) {
        // Asumiendo que quisieras obtenerlo de una tabla de precios o del mismo producto
        return 0.0f; // Aquí integrarías tu lógica de PrecioRepositorio
    }

    @Override
    public void activar(int id) {
        Producto p = repositorio.buscarPorId(id).orElseThrow();
        p.setEstado(true);
        repositorio.guardar(p);
    }

    @Override
    public void desactivar(int id) {
        Producto p = repositorio.buscarPorId(id).orElseThrow();
        p.setEstado(false);
        repositorio.guardar(p);
    }

}
