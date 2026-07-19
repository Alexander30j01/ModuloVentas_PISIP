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
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.CategoriaRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.DetallePedidoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.DocumentacionRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.PedidosRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.PermisoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.ProductoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.SolicitudCreditoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.UsuariosRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.VisitaRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IDetallePedidoJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IDocumentacionJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPermisoJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.ISolicitudCreditoJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IUsuariosJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IVisitaJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.ICategoriaJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IClienteJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IDetallePedidoJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IDocumentacionJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IPedidosJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IPermisosJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IProductoJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.ISolicitudCreditoJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IUsuariosJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IVisitaJpaRepositorio;

@Configuration
public class ConfigPisip {
	
	@Bean
	IClienteRepositorio clienteRepositorio(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper mapper) {
		return new ClienteRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IClienteUseCase cliente(IClienteRepositorio repositorio) {
		return new ClienteUseCaseImpl(repositorio);
	}

	@Bean
	IDetallePedidoRepositorio detallePedidoRepositorio(IDetallePedidoJpaRepositorio jpaRepositorio, IDetallePedidoJpaMapper mapper) {
		return new DetallePedidoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IDetallePedidoUseCase detallePedidoUseCase(IDetallePedidoRepositorio detallePedidoRepositorio) {
		return new DetallePedidoUseCaseImpl(detallePedidoRepositorio);
	}

	@Bean
	ICategoriaRepositorio categoriaRepositorio(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper	 mapper) {
		return new CategoriaRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	ICategoriaUseCase categoriaUseCase(ICategoriaRepositorio categoriaRepositorio) {
		return new CategoriaUseCaseImpl(categoriaRepositorio);
	}

	@Bean
	IProductoRepositorio productoRepositorio(IProductoJpaRepositorio jpaRepositorio, IProductoJpaMapper mapper) {
		return new ProductoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IProductoUseCase productoUseCase(IProductoRepositorio productoRepositorio) {
		return new ProductoUseCaseImpl(productoRepositorio);
	}


	@Bean
	IPedidosRepositorio pedidosRepositorio(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper mapper) {
		return new PedidosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IPedidosUseCase pedidosUseCase(IPedidosRepositorio pedidosRepositorio) {
		return new PedidosUseCaseImpl(pedidosRepositorio);
	}


	@Bean
	ISolicitudCreditoRepositorio solicitudCreditoRepositorio(ISolicitudCreditoJpaRepositorio jpaRepositorio, ISolicitudCreditoJpaMapper mapper) {
		return new SolicitudCreditoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	ISolicitudCreditoUseCase solicitudCreditoUseCase(ISolicitudCreditoRepositorio solicitudCreditoRepositorio) {
		return new SolicitudCreditoUseCaseImpl(solicitudCreditoRepositorio);
	}

	@Bean
	IUsuariosRepositorio usuariosRepositorio(IUsuariosJpaRepositorio jpaRepositorio, IUsuariosJpaMapper mapper) {
		return new UsuariosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IUsuariosUseCase usuariosUseCase(IUsuariosRepositorio usuariosRepositorio) {
		return new UsuariosUseCaseImpl(usuariosRepositorio);
	}

	@Bean
	IVisitaRepositorio visitaRepositorio(IVisitaJpaRepositorio jpaRepositorio, IVisitaJpaMapper mapper) {
		return new VisitaRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IVisitaUseCase visitaUseCase(IVisitaRepositorio visitaRepositorio) {
		return new VisitaUseCaseImpl(visitaRepositorio);
	}


	@Bean
	IPermisoRepositorio permisoRepositorio(IPermisosJpaRepositorio jpaRepositorio, IPermisoJpaMapper mapper) {
		return new PermisoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IPermisoUseCase permisoUseCase(IPermisoRepositorio permisoRepositorio) {
		return new PermisoUseCaseImpl(permisoRepositorio);
	}

	@Bean
	IDocumentacionRepositorio documentacionRepositorio(IDocumentacionJpaRepositorio jpaRepositorio, IDocumentacionJpaMapper mapper) {
		return new DocumentacionRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IDocumentacionUseCase documentacionUseCase(IDocumentacionRepositorio documentacionRepositorio) {
		return new DocumentacionUseCaseImpl(documentacionRepositorio);
	}

}
