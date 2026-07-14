package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.VisitaEntity;

public interface IVisitaJpaRepositorio extends JpaRepository<VisitaEntity, Integer> {

}
