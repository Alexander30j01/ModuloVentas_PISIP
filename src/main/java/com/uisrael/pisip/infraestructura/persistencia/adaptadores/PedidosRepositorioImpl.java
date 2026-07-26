package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;

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
	public Pedido crearPedido(Pedido pedido) {
		PedidoEntity entity = entityMapper.toEntity(pedido);
		PedidoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public List<Pedido> listarPedido() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public Pedido buscarPorId(int idPedidos) {
		return jpaRepositorio.findById(idPedidos).map(entityMapper::toDominio).orElse(null);
	}

	@Override
	public Pedido actualizarPedido(Pedido pedido) {
		PedidoEntity entity = entityMapper.toEntity(pedido);
		PedidoEntity actualizado = jpaRepositorio.save(entity);
		return entityMapper.toDominio(actualizado);
	}

}