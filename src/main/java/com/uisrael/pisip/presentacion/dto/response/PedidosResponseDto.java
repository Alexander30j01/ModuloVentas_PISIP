package com.uisrael.pisip.presentacion.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PedidosResponseDto {
	private int idPedidos;
	private LocalDateTime fechaRegistro;
	private BigDecimal subtotal;
	private BigDecimal totalFinal;
	private String estado;
	private String metodoPago;
	private Integer idCliente;
	private Integer idVendedor;

}
