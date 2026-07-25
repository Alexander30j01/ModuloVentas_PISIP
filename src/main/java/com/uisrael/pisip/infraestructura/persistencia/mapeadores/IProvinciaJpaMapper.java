package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;

@Mapper(componentModel = "spring")
public interface IProvinciaJpaMapper {

	Provincia toDomain(ProvinciaEntity entity);

	ProvinciaEntity toEntity(Provincia provinciaPojo);
}
