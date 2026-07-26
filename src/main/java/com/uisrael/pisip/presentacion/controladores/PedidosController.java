package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.dominio.entidades.Pedido;
import com.uisrael.pisip.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PedidosResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.PedidosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
	private final IPedidosUseCase pedidosUseCase;
	private final PedidosDtoMapper mapper;

	public PedidosController(IPedidosUseCase pedidosUseCase, PedidosDtoMapper mapper) {
		super();
		this.pedidosUseCase = pedidosUseCase;
		this.mapper = mapper;
	}
	
	public  ResponseEntity<PedidosResponseDto> crearPedido(@Valid @RequestBody PedidosRequestDto request){
		Pedido pedidoDominio = mapper.toDomain(request);
		Pedido pedidoCreado = pedidosUseCase.crearPedido(pedidoDominio);
		PedidosResponseDto response = mapper.toResponse(pedidoCreado);
		return ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
