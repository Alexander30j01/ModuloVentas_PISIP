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
@Table(name = "usuario")
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private String nombre;
    private String apellido;
    private String rol;
    private String correoUsuario;
    private String contrasena;
    private String region;
    private boolean activo;
    private boolean sesionActiva;
    private int numeroVisitas;
    
    
    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private RolEntity fkRolEntity;
    
    @ManyToOne
    @JoinColumn(name = "fk_region")
    private RegionEntity fkRegionEntity;

}