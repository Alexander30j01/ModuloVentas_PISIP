package com.uisrael.pisip.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "clientes")
public class ClientesEntity {
	@Id
	private int idClientes;
	private String ruc;
	private String telefono;
	private String nombreComercial;
	private String nombre;
	private String apellido;
	private String direccion;
	private String latitude;
	private String longitude;
	private boolean estado;

}