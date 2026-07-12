package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidosEntity;

public interface IPedidosJpaRepositorio extends JpaRepository<PedidosEntity, Integer>{

}
