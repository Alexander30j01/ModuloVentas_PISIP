package com.uisrael.pisip.presentacion.dto.response;

import lombok.Data;

@Data
public class DetallePedidoResponseDto {
	private int idDetallePedidos;
	private int cantidad;
	private float precioUnitario;

}
