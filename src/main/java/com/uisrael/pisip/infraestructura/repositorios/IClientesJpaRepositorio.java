package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.ClientesEntity;

public interface IClientesJpaRepositorio extends JpaRepository<ClientesEntity,Integer>{

}
