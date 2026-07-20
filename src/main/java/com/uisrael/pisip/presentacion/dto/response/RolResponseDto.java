package com.uisrael.pisip.presentacion.dto.response;

import lombok.Data;

@Data
public class RolResponseDto {
    
    private int idRol;
    
    private String nombre;
    
    private String descripcion;
    
    private boolean estado;

}