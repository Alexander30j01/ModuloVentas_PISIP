package com.uisrael.pisip.aplicacion.casouso.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPrecioUseCase;
import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.dominio.repositorio.IPrecioRepositorio;


@Service
public class PrecioUseCaseImpl implements IPrecioUseCase {

	private final IPrecioRepositorio repositorio;

	public PrecioUseCaseImpl(IPrecioRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
    public Precio crearPrecio(Precio precio) {
        BigDecimal ivaCalculado = calcularIvaGenerico(precio.getPrecioBase(), precio.getPorcentajeIva());
        precio.setPrecioConIva(precio.getPrecioBase().add(ivaCalculado));
        return repositorio.guardar(precio);
    }

    @Override
    public Precio buscarPorId(int idPrecio) {
        return repositorio.buscarPorId(idPrecio).orElse(null);
    }

    @Override
    public List<Precio> listarTodos() {
        return repositorio.listarTodo();
    }

    @Override
    public Precio obtenerActivo() {
        return repositorio.obtenerPrecioActivo();
    }

    @Override
    public BigDecimal calcularIva(BigDecimal montoBase) {
        Precio precioActivo = repositorio.obtenerPrecioActivo();
        if (precioActivo == null || precioActivo.getPorcentajeIva() == null) {
            return BigDecimal.ZERO;
        }
        return calcularIvaGenerico(montoBase, precioActivo.getPorcentajeIva());
    }

    @Override
    public BigDecimal calcularPrecioConIva(BigDecimal montoBase) {
        BigDecimal iva = calcularIva(montoBase);
        return montoBase.add(iva);
    }


    private BigDecimal calcularIvaGenerico(BigDecimal base, BigDecimal porcentaje) {
        if (base == null || porcentaje == null) {
            return BigDecimal.ZERO;
        }
        return base.multiply(porcentaje)
                   .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    }

	
}
