package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.EvidenciaEntity;

public interface IEvidenciaJpaRepositorio extends JpaRepository<EvidenciaEntity, Integer> {

}
