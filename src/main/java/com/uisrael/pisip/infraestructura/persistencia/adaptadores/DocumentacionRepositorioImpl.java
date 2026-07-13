package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.dominio.repositorio.IDocumentacionRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DocumentacionEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IDocumentacionJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IDocumentacionJpaRepositorio;

@Component
public class DocumentacionRepositorioImpl implements IDocumentacionRepositorio {

	private final IDocumentacionJpaRepositorio jpaRepositorio;
	private final IDocumentacionJpaMapper entityMapper;

	public DocumentacionRepositorioImpl(IDocumentacionJpaRepositorio jpaRepositorio,
			IDocumentacionJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Documentacion guardar(Documentacion documento) {

		DocumentacionEntity entity = entityMapper.toEntity(documento);
		DocumentacionEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

}
