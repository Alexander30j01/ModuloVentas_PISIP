package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.dominio.repositorio.IDetallePedidoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DetallePedidoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IDetallePedidoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IDetallePedidoJpaRepositorio;
@Component
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
	public DetallePedido guardar(DetallePedido nuevodetallePedido) {
		DetallePedidoEntity entidad = entityMapper.toEntity(nuevodetallePedido);
		DetallePedidoEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<DetallePedido> buscarPorId(int idDetallePedido) {
		return jpaRepositorio.findById(idDetallePedido).map(entityMapper::toDominio);
	}

	@Override
	public List<DetallePedido> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idDetallePedido) {
		jpaRepositorio.deleteById(idDetallePedido);

	}

}
