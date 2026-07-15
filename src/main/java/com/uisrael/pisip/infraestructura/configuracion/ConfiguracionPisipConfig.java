package com.uisrael.pisip.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.pisip.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IUsuariosUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IVisitaUseCase;
import com.uisrael.pisip.aplicacion.casouso.impl.ClienteUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.DocumentacionUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.SolicitudCreditoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.UsuariosUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.VisitaUseCaseImpl;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.pisip.dominio.repositorio.IVisitaRepositorio;

@Configuration
public class ConfiguracionPisipConfig {

	@Bean
	public IClienteUseCase clienteUseCase(IClienteRepositorio clienteRepositorio) {
		return new ClienteUseCaseImpl(clienteRepositorio);
	}

	@Bean
	public IDocumentacionUseCase documentacionUseCase(IDocumentacionRepositorio documentacionRepositorio) {
		return new DocumentacionUseCaseImpl(documentacionRepositorio);
	}

	@Bean
	public ISolicitudCreditoUseCase solicitudCreditoUseCase(ISolicitudCreditoRepositorio solicitudCreditoRepositorio) {
		return new SolicitudCreditoUseCaseImpl(solicitudCreditoRepositorio);
	}

	@Bean
	public IUsuariosUseCase usuariosUseCase(IUsuariosRepositorio usuariosRepositorio) {
		return new UsuariosUseCaseImpl(usuariosRepositorio);
	}

	@Bean
	public IVisitaUseCase visitaUseCase(IVisitaRepositorio visitaRepositorio) {
		return new VisitaUseCaseImpl(visitaRepositorio);
	}
}
