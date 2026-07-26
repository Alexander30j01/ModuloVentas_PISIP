package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Rol;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RolEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRolJpaMapper {

    Rol toDominio(RolEntity entity);

    RolEntity toEntity(Rol RolPojo);

}