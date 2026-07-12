package com.uisrael.pisip.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.pisip.aplicacion.casouso.entrada.IClientesUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.aplicacion.casouso.impl.ClientesUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.DetallePedidoUseCaseImpl;
import com.uisrael.pisip.aplicacion.casouso.impl.PedidosUseCaseImpl;
import com.uisrael.pisip.dominio.repositorio.IClienteRepositorio;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;
import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.ClientesRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.DetallePedidoRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.adaptadores.PedidosRepositorioImpl;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IClientesJpaMapper;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IClientesJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IDetallePedidoJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IEvidenciaJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IPedidosJpaRepositorio;
import com.uisrael.pisip.infraestructura.repositorios.IPrecioJpaRepositorio;

@Configuration
public class PisipConfig {
	// Clientes
	@Bean
	IClienteRepositorio clienteRepositorio(IClientesJpaRepositorio jpaRepositorio, IClientesJpaMapper mapper) {
		return new ClientesRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IClientesUseCase cliente(IClienteRepositorio repositorio) {
		return new ClientesUseCaseImpl(repositorio);
	}

	// Detalle Pedido
	@Bean
	IDetallePedidoRepositorio detallePedidoRepositorio(IDetallePedidoJpaRepositorio jpaRepositorio,IDetallePedidoJpaMapper mapper) {
		return new DetallePedidoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IDetallePedidoUseCase pedido(IDetallePedidoRepositorio repositorio) {
		return new DetallePedidoUseCaseImpl(repositorio);
	}
	//Pedidos
	@Bean
	IPedidosRepositorio pedidosRepositorio(IPedidosJpaRepositorio jpaRepositorio,IPedidosJpaMapper mapper) {
		return new PedidosRepositorioImpl(jpaRepositorio, mapper);
	}
	@Bean
	IPedidosUseCase pedidos(IPedidosRepositorio repositorio) {
		return new PedidosUseCaseImpl(repositorio);
	}
}
