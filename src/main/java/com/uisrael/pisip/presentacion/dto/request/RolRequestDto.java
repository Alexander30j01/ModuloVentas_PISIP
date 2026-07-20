package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RolRequestDto {
    
    private int idRol;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String descripcion;
    
    private boolean estado;

}