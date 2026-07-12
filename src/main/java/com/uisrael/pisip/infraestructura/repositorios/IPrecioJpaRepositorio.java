package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.PrecioEntity;

public interface IPrecioJpaRepositorio extends JpaRepository<PrecioEntity, Integer>{

}
