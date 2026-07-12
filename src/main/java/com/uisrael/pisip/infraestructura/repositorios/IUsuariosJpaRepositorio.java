package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.UsuariosEntity;

public interface IUsuariosJpaRepositorio extends JpaRepository<UsuariosEntity, Integer>{

}
