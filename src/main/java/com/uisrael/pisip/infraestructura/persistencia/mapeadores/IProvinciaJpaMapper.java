package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;

@Mapper(componentModel = "spring")
public interface IProvinciaJpaMapper {

	Provincia toDomain(ProvinciaEntity entity);

	// alias naming used across the project (Spanish). Keep both to avoid
	// compilation issues where other classes call toDominio(...)
	Provincia toDominio(ProvinciaEntity entity);

	ProvinciaEntity toEntity(Provincia provinciaPojo);
}
