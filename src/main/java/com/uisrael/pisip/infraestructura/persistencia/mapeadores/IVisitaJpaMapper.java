package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.uisrael.pisip.dominio.entidades.Visita;
import com.uisrael.pisip.infraestructura.persistencia.jpa.VisitaEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IVisitaJpaMapper {

    Visita toDominio(VisitaEntity entity);

    VisitaEntity toEntity(Visita visita);

}
