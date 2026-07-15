package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Categoria;
import com.uisrael.pisip.infraestructura.persistencia.jpa.CategoriaEntity;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {

	Categoria toDomain(CategoriaEntity entity);

	CategoriaEntity toEntity(Categoria CategoriaPojo);

}
