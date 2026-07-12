package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Producto;
import com.uisrael.pisip.infraestructura.persistencia.jpa.ProductoEntity;

@Mapper(componentModel = "spring")
public interface IProductoJpaMapper {
	
	Producto toDominio(ProductoEntity entity);
	
	ProductoEntity toEntity(Producto producto);

}
