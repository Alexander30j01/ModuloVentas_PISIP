package com.uisrael.pisip.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPermisoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IUsuariosUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IVisitaUseCase;
import com.uisrael.pisip.aplicacion.casouso.impl.DocumentacionUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.PermisoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.SolicitudCreditoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.UsuariosUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.VisitaUseCaseImpl;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;
import com.uisrael.pisip.dominio.repositorio.IPermisoRepositorio;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.pisip.dominio.repositorio.IVisitaRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.PermisoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPermisoJpaMapper;

import com.uisrael.pisip.infraestructura.repositorios.IPermisosJpaRepositorio;

@Configuration
public class ConfiguracionPisip {

	@Bean
	IDocumentacionUseCase documentacionUseCase(IDocumentacionRepositorio documentacionRepositorio) {
		return new DocumentacionUseCaseImpl(documentacionRepositorio);
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
	IPermisoRepositorio permisoRepositorio(IPermisosJpaRepositorio jpaRepositorio, IPermisoJpaMapper mapper) {
		return new PermisoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IPermisoUseCase permiso(IPermisoRepositorio repositorio) {
		return new PermisoUseCaseImpl(repositorio);
	}
}