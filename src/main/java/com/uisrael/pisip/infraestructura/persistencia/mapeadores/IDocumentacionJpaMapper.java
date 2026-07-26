package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.infraestructura.persistencia.jpa.DocumentacionEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDocumentacionJpaMapper {
	
	Documentacion toDomain(DocumentacionEntity entity);
	
	DocumentacionEntity toEntity(Documentacion documento);

}
