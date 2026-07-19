package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "permiso")
public class PermisoEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idPermiso;
	private String nombre;
	private String descripcion;
	private boolean estado;
	
	@OneToMany(mappedBy = "fkPermisoEntity")
	private List<RolPermisoEntity> listaPermisoRoles;

}
