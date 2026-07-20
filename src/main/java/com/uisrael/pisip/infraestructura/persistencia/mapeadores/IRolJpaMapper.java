package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RolEntity;

@Mapper(componentModel = "spring")
public interface IRolJpaMapper {

    Rol toDominio(RolEntity entity);

    RolEntity toEntity(Rol RolPojo);

}