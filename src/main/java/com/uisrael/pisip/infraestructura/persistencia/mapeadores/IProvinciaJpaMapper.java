package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProvinciaJpaMapper {

	Provincia toDominio(ProvinciaEntity entity);

	ProvinciaEntity toEntity(Provincia provinciaPojo);
}
