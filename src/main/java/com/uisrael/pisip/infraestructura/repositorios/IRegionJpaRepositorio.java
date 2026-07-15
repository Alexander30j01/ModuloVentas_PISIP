package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RegionEntity;

@Repository
public interface IRegionJpaRepositorio extends JpaRepository<RegionEntity, Integer> {
    // Métodos de consulta
}