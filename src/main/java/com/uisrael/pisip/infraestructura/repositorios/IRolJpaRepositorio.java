package com.uisrael.pisip.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RolEntity;

public interface IRolJpaRepositorio extends JpaRepository<RolEntity, Integer>{

}
