package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "rol_permiso")
public class RolPermisoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRolPermiso;
	
	@ManyToOne
	@JoinColumn(name = "fk_rol")
	private RolEntity fkRolEntity;
	
	@ManyToOne
	@JoinColumn(name = "fk_permiso")
	private PermisoEntity fkPermisoEntity;
	
	private String observacion;
    private boolean estado;
	
	
	

}
