package com.uisrael.pisip.dominio.repositorio;

import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Documentacion;

public interface IDocumentacionRepositorio {
	
	Documentacion guardar (Documentacion documento);
	
	void eliminar(int idDocumentacion);	
	
	Optional<Documentacion> obtenerPorId(int idDocumentacion);

}
