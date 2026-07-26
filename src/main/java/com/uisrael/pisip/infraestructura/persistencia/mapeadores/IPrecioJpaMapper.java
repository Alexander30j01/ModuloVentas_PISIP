package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PrecioEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPrecioJpaMapper {
	
	PrecioEntity toEntity(Precio dominio);


    Precio toDominio(PrecioEntity entity);
}
