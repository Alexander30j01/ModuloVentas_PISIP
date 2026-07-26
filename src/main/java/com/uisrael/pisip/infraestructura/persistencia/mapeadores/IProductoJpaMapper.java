package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProductoEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductoJpaMapper {

	Producto toDominio(ProductoEntity entity);

	ProductoEntity toEntity(Producto producto);
}
