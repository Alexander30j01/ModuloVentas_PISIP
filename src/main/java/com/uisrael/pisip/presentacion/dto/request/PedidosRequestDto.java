package com.uisrael.pisip.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PedidosRequestDto {
	@NotBlank
	private int idPedidos;
	@NotBlank
	private Date fechaRegistro;
	@NotBlank
	private float subtotal;
	@NotBlank
	private float totalFinal;
	@NotBlank
	private String estadoPedido;
	@NotBlank
	private String metodoPago;

}
