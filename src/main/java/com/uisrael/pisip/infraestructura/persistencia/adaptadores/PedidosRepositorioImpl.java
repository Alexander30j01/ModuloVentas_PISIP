package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IPedidosJpaRepositorio;
@Component
public class PedidosRepositorioImpl implements IPedidosRepositorio {

	private final IPedidosJpaRepositorio jpaRepositorio;
	private final IPedidosJpaMapper entityMapper;

	public PedidosRepositorioImpl(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}
	
	@Override
    public Pedidos guardar(Pedidos pedido) {
        var entity = entityMapper.toEntity(pedido);
        var guardado = jpaRepositorio.save(entity);
        return entityMapper.toDominio(guardado);
    }

    @Override
    public Optional<Pedidos> buscarPorId(int idPedido) {
        return jpaRepositorio.findById(idPedido).map(entityMapper::toDominio);
    }

    @Override
    public void eliminar(int idPedido) {
        jpaRepositorio.deleteById(idPedido);
    }

}