package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Region;
import java.util.List;

public interface IRegionUseCase {
    
    Region registrar(Region region);
    
    Region actualizar(Region region);
    
    // Acciones de negocio para el estado
    void activar(int idRegion);
    
    void desactivar(int idRegion);
    
    // Acciones de gestión de vendedores
    void asignarVendedor(int idRegion, int idVendedor);
    
    void removerVendedor(int idRegion, int idVendedor);
    
    // Consultas
    Region buscarPorId(int idRegion);
    
    List<Region> listarTodas();
}