package com.uisrael.pisip.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.aplicacion.casouso.impl.DocumentacionUseCaseImpl;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;

@Configuration
public class ConfiguracionPisip {
	
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
