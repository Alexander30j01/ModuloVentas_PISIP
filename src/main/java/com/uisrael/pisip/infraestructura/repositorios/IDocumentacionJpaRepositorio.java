package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.pisip.infraestructura.persistencia.jpa.DocumentacionEntity;

public interface IDocumentacionJpaRepositorio extends JpaRepository<DocumentacionEntity, Integer>{

}
