package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.infraestructura.persistencia.jpa.UsuariosEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUsuariosJpaMapper {

	Usuarios toDominio(UsuariosEntity entity);

	UsuariosEntity toEntity(Usuarios usuarios);

}
