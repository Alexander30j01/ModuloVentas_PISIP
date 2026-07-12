package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.infraestructura.persistencia.jpa.SolicitudCreditoEntity;

@Mapper(componentModel = "spring")
public interface ISolicitudCreditoJpaMapper {

	SolicitudCredito toDominio(SolicitudCreditoEntity entity);

	SolicitudCreditoEntity toEntity(SolicitudCredito solicitudCredito);

}
