package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DetallePedidoRequestDto {
	@NotBlank
	private int idDetallePedidos;
	@NotBlank
	private int cantidad;
	@NotBlank
	private float precioUnitario;
	@NotBlank
	private float subTotal;
	@NotBlank
	private boolean estado;

}
