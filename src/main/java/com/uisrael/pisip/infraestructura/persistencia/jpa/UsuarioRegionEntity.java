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
@Table(name = "usuario_region")
public class UsuarioRegionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuarioRegion;

	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private UsuariosEntity fkUsuarioEntity;

	@ManyToOne
	@JoinColumn(name = "fk_region")
	private RegionEntity fkRegionEntity;

	private String observacion;
	private boolean estado;

}
