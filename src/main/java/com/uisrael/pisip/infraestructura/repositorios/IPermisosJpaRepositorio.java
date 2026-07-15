package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.PermisoEntity;

public interface IPermisosJpaRepositorio extends JpaRepository<PermisoEntity, Integer>{

}
