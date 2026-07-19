package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "rol")
public class RolEntity {
	@Id
	private int idRol;
	private String nombre;
	private String descripcion;
	private boolean estado;
	
	@OneToMany(mappedBy = "fkRolEntity")
	private List<RolPermisoEntity> listaRolPermiso;

	

}
