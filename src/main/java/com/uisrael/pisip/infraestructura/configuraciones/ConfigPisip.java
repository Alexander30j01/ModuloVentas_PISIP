package com.uisrael.pisip.infraestructura.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.pisip.aplicacion.casouso.entrada.ICategoriaUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPermisoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IUsuariosUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IVisitaUseCase;
import com.uisrael.pisip.aplicacion.casouso.impl.CategoriaUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.ClienteUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.DetallePedidoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.DocumentacionUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.PedidosUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.PermisoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.ProductoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.SolicitudCreditoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.UsuariosUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.VisitaUseCaseImpl;
import com.uisrael.pisip.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;
import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.pisip.dominio.repositorio.IPermisoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.pisip.dominio.repositorio.IVisitaRepositorio;

@Configuration
public class ConfigPisip {
	
	@Bean
	IDetallePedidoUseCase detallePedidoUseCase(IDetallePedidoRepositorio detallePedidoRepositorio) {
		return new DetallePedidoUseCaseImpl(detallePedidoRepositorio);
	}

	@Bean
	IClienteUseCase clienteUseCase(IClienteRepositorio clienteRepositorio) {
		return new ClienteUseCaseImpl(clienteRepositorio);
	}

	@Bean
	ICategoriaUseCase categoriaUseCase(ICategoriaRepositorio categoriaRepositorio) {
		return new CategoriaUseCaseImpl(categoriaRepositorio);
	}

	@Bean
	IProductoUseCase productoUseCase(IProductoRepositorio productoRepositorio) {
		return new ProductoUseCaseImpl(productoRepositorio);
	}

	@Bean
	IPedidosUseCase pedidosUseCase(IPedidosRepositorio pedidosRepositorio) {
		return new PedidosUseCaseImpl(pedidosRepositorio);
	}

	@Bean
	ISolicitudCreditoUseCase solicitudCreditoUseCase(ISolicitudCreditoRepositorio solicitudCreditoRepositorio) {
		return new SolicitudCreditoUseCaseImpl(solicitudCreditoRepositorio);
	}

	@Bean
	IUsuariosUseCase usuariosUseCase(IUsuariosRepositorio usuariosRepositorio) {
		return new UsuariosUseCaseImpl(usuariosRepositorio);
	}

	@Bean
	IVisitaUseCase visitaUseCase(IVisitaRepositorio visitaRepositorio) {
		return new VisitaUseCaseImpl(visitaRepositorio);
	}

	@Bean
	IPermisoUseCase permisoUseCase(IPermisoRepositorio permisoRepositorio) {
		return new PermisoUseCaseImpl(permisoRepositorio);
	}

	@Bean
	IDocumentacionUseCase documentacionUseCase(IDocumentacionRepositorio documentacionRepositorio) {
		return new DocumentacionUseCaseImpl(documentacionRepositorio);
	}

}
