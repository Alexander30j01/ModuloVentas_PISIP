package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.SolicitudCreditoEntity;

public interface ISolicitudCreditoJpaRepositorio extends JpaRepository<SolicitudCreditoEntity, Integer> {

}
