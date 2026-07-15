package com.uisrael.pisip.presentacion.dto.request;

import java.time.Instant;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class VisitaRequestDto {
     @NotBlank
    private int idVisita;
    @NotBlank
    private Instant ingreso;
    @NotBlank
    private Instant salida;
    @NotBlank
    private double latitud;
    @NotBlank
    private double longitud;
    @NotBlank
    private String observacion;
    @NotBlank
    private boolean estado;

}
