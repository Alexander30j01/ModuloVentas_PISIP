package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.dominio.repositorio.IPedidoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IPedidosJpaRepositorio;

public class PedidosRepositorioImpl implements IPedidoRepositorio {

	private final IPedidosJpaRepositorio jpaRepositorio;
	private final IPedidosJpaMapper entityMapper;

	public PedidosRepositorioImpl(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Pedido crerPedido(Pedido pedido) {
		PedidoEntity entity = entityMapper.toEntity(pedido);
		PedidoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDominio(guardado);
	}

}