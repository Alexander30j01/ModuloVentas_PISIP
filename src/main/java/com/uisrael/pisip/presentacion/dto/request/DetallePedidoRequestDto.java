package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DetallePedidoRequestDto {
	
	@NotNull
	private int idDetallePedidos;
	@NotBlank
	private int cantidad;
	@NotBlank
	private float precioUnitario;
	@NotBlank
	private float subTotal;
	@NotNull
	private boolean estado;

}
