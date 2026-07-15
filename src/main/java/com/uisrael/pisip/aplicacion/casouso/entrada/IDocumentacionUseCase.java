	package com.uisrael.pisip.aplicacion.casouso.entrada;

import com.uisrael.pisip.dominio.entidades.Documentacion;

public interface IDocumentacionUseCase {

	Documentacion subir(Documentacion documento);	
	
	Documentacion actualizar(int idDocumentacion, Documentacion documento);

	void eliminarDocumento(int idDocumentacion);

	Documentacion validarDocumento(int idDocumentacion, boolean nuevoestado);

}
