package com.uisrael.pisip.aplicacion.casouso.entrada;

import java.math.BigDecimal;
import java.util.List;

import com.uisrael.pisip.dominio.entidades.Precio;

public interface IPrecioUseCase {
	
	Precio crearPrecio(Precio precio);

    Precio buscarPorId(int idPrecio);

    List<Precio> listarTodos();

    Precio obtenerActivo();

    BigDecimal calcularIva(BigDecimal montoBase);

    BigDecimal calcularPrecioConIva(BigDecimal montoBase);
}
