package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuariosRequestDto {

    private int idUsuario;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String rol;

    @NotBlank
    private String correoUsuario;

    @NotBlank
    private String contrasena;

    @NotBlank
    private String region;

    private boolean activo;
    private boolean sesionActiva;
    private int numeroVisitas;

}