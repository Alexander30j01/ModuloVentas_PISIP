package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IPedidosJpaRepositorio;

public class PedidosRepositorioImpl implements IPedidosRepositorio {

	private final IPedidosJpaRepositorio jpaRepositorio;
	private final IPedidosJpaMapper entityMapper;

	public PedidosRepositorioImpl(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Pedidos guardar(Pedidos nuevopedidos) {
		PedidoEntity entidad = entityMapper.toEntity(nuevopedidos);
		PedidoEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<Pedidos> buscarPorId(int idPedidos) {
		return jpaRepositorio.findById(idPedidos).map(entityMapper::toDominio);
	}

	@Override
	public List<Pedidos> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idPedidos) {
		jpaRepositorio.deleteById(idPedidos);
	}

}
