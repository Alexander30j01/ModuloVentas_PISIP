package com.uisrael.pisip.aplicacion.casouso.impl;

import com.uisrael.pisip.aplicacion.casouso.entrada.IRegionUseCase;
import com.uisrael.pisip.dominio.entidades.Region;
import com.uisrael.pisip.dominio.repositorio.IRegionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionUseCaseImpl implements IRegionUseCase {

    private final IRegionRepositorio repositorio;

    // Inyección de dependencia por constructor
    public RegionUseCaseImpl(IRegionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Region registrar(Region region) {
        // Regla: Validar que el nombre no esté vacío
        if (region.getNombre() == null || region.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la región es obligatorio.");
        }
        return repositorio.registrar(region);
    }

    @Override
    public Region actualizar(Region region) {
        return repositorio.actualizar(region);
    }

    @Override
    public void activar(int idRegion) {
        repositorio.cambiarRegion(idRegion, true);
    }

    @Override
    public void desactivar(int idRegion) {
        repositorio.cambiarRegion(idRegion, false);
    }

    @Override
    public void asignarVendedor(int idRegion, int idVendedor) {
        // Aquí podrías agregar lógica: ¿el vendedor ya está asignado?
        repositorio.asignarVendedor(idRegion, idVendedor);
    }

    @Override
    public void removerVendedor(int idRegion, int idVendedor) {
        repositorio.removerVendedor(idRegion, idVendedor);
    }

    @Override
    public Region buscarPorId(int idRegion) {
        return repositorio.buscarPorId(idRegion);
    }

    @Override
    public List<Region> listarTodas() {
        return repositorio.listarTodos();
    }
}