package com.uisrael.pisip.dominio.repositorio;

import com.uisrael.pisip.dominio.entidades.Region;
import java.util.List;

public interface IRegionRepositorio {

	Region registrar(Region region);
	Region actualizar(Region region);
	void asignarVendedor(int idRegion, int idVendedor);
	void removerVendedor(int idRegion, int idVendedor);
	Region buscarPorId(int idRegion);
	List<Region> listarTodos();
	void cambiarRegion(int idRegion, boolean estado);
}