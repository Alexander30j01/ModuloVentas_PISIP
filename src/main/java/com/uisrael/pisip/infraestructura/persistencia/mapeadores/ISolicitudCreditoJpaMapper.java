package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.infraestructura.persistencia.jpa.SolicitudCreditoEntity;

@Mapper(componentModel = "spring", uses = { IClienteJpaMapper.class })
public interface ISolicitudCreditoJpaMapper {

	@Mapping(source = "fkClienteEntity", target = "cliente")
	SolicitudCredito toDominio(SolicitudCreditoEntity entity);

	@Mapping(source = "cliente", target = "fkClienteEntity")
	SolicitudCreditoEntity toEntity(SolicitudCredito solicitudCredito);

}
