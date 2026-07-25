package com.uisrael.pisip.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PedidosRequestDto {

	@NotNull(message = "El ID del cliente es obligatorio")
	@Positive(message = "El ID del cliente debe ser un número positivo")
	private Integer idCliente;

	@NotNull(message = "El ID del vendedor es obligatorio")
	@Positive(message = "El ID del vendedor debe ser un número positivo")
	private Integer idVendedor;

	@NotBlank(message = "El método de pago es obligatorio")
	private String metodoPago;
}
