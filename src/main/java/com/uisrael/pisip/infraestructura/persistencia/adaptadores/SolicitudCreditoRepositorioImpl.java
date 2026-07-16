package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.dominio.repositorio.ISolicitudCreditoRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.SolicitudCreditoEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.ISolicitudCreditoJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.ISolicitudCreditoJpaRepositorio;
@Component
public class SolicitudCreditoRepositorioImpl implements ISolicitudCreditoRepositorio{
	
	private final ISolicitudCreditoJpaRepositorio jpaRepositorio;
	private final ISolicitudCreditoJpaMapper entityMapper;

	public SolicitudCreditoRepositorioImpl(ISolicitudCreditoJpaRepositorio jpaRepositorio,
			ISolicitudCreditoJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public SolicitudCredito guardar(SolicitudCredito nuevosolicitudCredito) {
		SolicitudCreditoEntity entidad=entityMapper.toEntity(nuevosolicitudCredito);
		SolicitudCreditoEntity guardado=jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<SolicitudCredito> buscarPorId(int idSolicitudCredito) {
		return jpaRepositorio.findById(idSolicitudCredito).map(entityMapper::toDominio);
	}

	@Override
	public List<SolicitudCredito> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idSolicitudCredito) {
		jpaRepositorio.deleteById(idSolicitudCredito);
		
	}
	
	@Override
	public SolicitudCredito registrar(SolicitudCredito solicitudCredito) {

	    solicitudCredito.registrar();

	    SolicitudCreditoEntity entidad = entityMapper.toEntity(solicitudCredito);

	    SolicitudCreditoEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public SolicitudCredito aprobar(int idSolicitudCredito) {

	    SolicitudCredito solicitud = buscarPorId(idSolicitudCredito)
	            .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));

	    solicitud.aprobar();

	    SolicitudCreditoEntity entidad = entityMapper.toEntity(solicitud);

	    SolicitudCreditoEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public SolicitudCredito rechazar(int idSolicitudCredito) {

	    SolicitudCredito solicitud = buscarPorId(idSolicitudCredito)
	            .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));

	    solicitud.rechazar();

	    SolicitudCreditoEntity entidad = entityMapper.toEntity(solicitud);

	    SolicitudCreditoEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	

}
