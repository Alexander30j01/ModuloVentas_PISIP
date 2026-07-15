package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProductoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IProductoJpaRepositorio;

@Service
public class ProductoRepositorioImpl implements IProductoRepositorio {

	private final IProductoJpaRepositorio JpaRepositorio;
	private final IProductoJpaMapper entityMapper;

	public ProductoRepositorioImpl(IProductoJpaRepositorio jpaRepositorio, IProductoJpaMapper entityMapper) {
		super();
		this.JpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Producto registrar(Producto nuevoproducto) {
		ProductoEntity entity = entityMapper.toEntity(nuevoproducto);
		ProductoEntity guardado = JpaRepositorio.save(entity);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Producto actualizar(Producto nuevoproducto) {
		ProductoEntity entity = entityMapper.toEntity(nuevoproducto);
		ProductoEntity actualizado = JpaRepositorio.save(entity);
		return entityMapper.toDominio(actualizado);
	}

	@Override
	public void cambiarEstado(int idProducto, boolean estado) {
		ProductoEntity entity = JpaRepositorio.findById(idProducto)
				.orElseThrow(() -> new RuntimeException("Producto no encontrado"));
		entity.setEstado(estado);
		JpaRepositorio.save(entity);

	}

	@Override
	public void actualizarStock(int idProducto, int stock) {
		ProductoEntity entity = JpaRepositorio.findById(idProducto)
				.orElseThrow(() -> new RuntimeException("Producto no encontrado"));
		entity.setStock(stock);
		JpaRepositorio.save(entity);

	}

	@Override
	public double consultarPrecioActual(int idProducto) {
		return 0;
	}

	@Override
	public Producto buscarPorId(int idProducto) {
		return JpaRepositorio.findById(idProducto).map(entityMapper::toDominio)
				.orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	}

	@Override
	public List<Producto> listarTodos() {
		return JpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

}
