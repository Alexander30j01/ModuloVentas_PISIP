package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DetallePedidoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IDetallePedidoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IDetallePedidoJpaRepositorio;

public class DetallePedidoRepositorioImpl implements IDetallePedidoRepositorio {

	private final IDetallePedidoJpaRepositorio jpaRepositorio;
	private final IDetallePedidoJpaMapper entityMapper;

	public DetallePedidoRepositorioImpl(IDetallePedidoJpaRepositorio jpaRepositorio,
			IDetallePedidoJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public DetallePedido guardar(DetallePedido detallePedido) {
		DetallePedidoEntity entity = entityMapper.toEntity(detallePedido);
		DetallePedidoEntity savedEntity = jpaRepositorio.save(entity);
		return entityMapper.toDomain(savedEntity);
	}

	@Override
	public Optional<DetallePedido> buscarPorId(int idDetallePedido) {

		return jpaRepositorio.findById(idDetallePedido).map(entityMapper::toDomain);

	}

	@Override
	public List<DetallePedido> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public void cambiarEstado(DetallePedido detallePedido, boolean aprobado) {
		var detallePedidoOptional = jpaRepositorio.findById(detallePedido.getIdDetallePedidos());
		detallePedidoOptional.ifPresent(detallePedidoJpa -> {
			detallePedidoJpa.setEstado(aprobado);
			jpaRepositorio.save(detallePedidoJpa);
		});

	}
}
