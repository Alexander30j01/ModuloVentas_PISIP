package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import com.uisrael.pisip.dominio.entidades.Permiso;
import com.uisrael.pisip.infraestructura.persistencia.jpa.PermisoEntity;

@Mapper(componentModel = "spring")
public interface IPermisoJpaMapper {

	Permiso toDomain(PermisoEntity entity);

	PermisoEntity toEntity(Permiso permiso);

}
