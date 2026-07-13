package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.PedidoEntity;

public interface IPedidosJpaRepositorio extends JpaRepository<PedidoEntity, Integer>{

}
