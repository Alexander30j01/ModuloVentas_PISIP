package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.ProvinciaEntity;

public interface IProvinciaJpaRepositorio extends JpaRepository<ProvinciaEntity, Integer> {

}
