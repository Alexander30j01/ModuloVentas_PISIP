package com.uisrael.pisip.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import com.uisrael.pisip.dominio.entidades.Region;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RegionEntity;

@Mapper(componentModel = "spring")
public interface IRegionJpaMapper {

	Region toDominio(RegionEntity entity);

	RegionEntity toEntity(Region region);
}
