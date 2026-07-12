package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PrecioEntity;

@Mapper(componentModel = "spring")
public interface IPrecioJpaMapper {

		Precio toDominio(PrecioEntity entity);

		PrecioEntity toEntity(Precio precio);

	}