package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.dominio.repositorio.IProductoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProductoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IProductoJpaRepositorio;
@Component
public class ProductoRepositorioImpl implements IProductoRepositorio {

	private final IProductoJpaRepositorio jpaRepositorio;
	private final IProductoJpaMapper entitytMapper;

	public ProductoRepositorioImpl(IProductoJpaRepositorio jpaRepositorio, IProductoJpaMapper entitytMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entitytMapper = entitytMapper;
	}

	@Override
	public Producto guardar(Producto nuevoproducto) {
		ProductoEntity entidad = entitytMapper.toEntity(nuevoproducto);
		ProductoEntity guardado = jpaRepositorio.save(entidad);
		return entitytMapper.toDominio(guardado);
	}

	@Override
	public Optional<Producto> buscarPorId(int idProducto) {
		return jpaRepositorio.findById(idProducto).map(entitytMapper::toDominio);
	}

	@Override
	public List<Producto> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entitytMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idProducto) {
		jpaRepositorio.deleteById(idProducto);
	}
	
	@Override
	public void actualizar(Producto producto) {
	    ProductoEntity entidad = entitytMapper.toEntity(producto);
	    jpaRepositorio.save(entidad); // JPA sabe que es un update si el ID ya existe
	}

}
