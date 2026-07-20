package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
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

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public PedidosResponseDto crearPedido(@Valid @RequestBody PedidosRequestDto request) {
		return mapper.toResponse(pedidosUseCase.crearPedido(mapper.toDomain(request)));
	}

	@PutMapping("/actualizar/{idPedido}")
	@ResponseStatus(HttpStatus.OK)
	public PedidosResponseDto actualizarPedido(@PathVariable int idPedido,
			@Valid @RequestBody PedidosRequestDto request) {
		return mapper.toResponse(pedidosUseCase.cambiarEstado(idPedido, mapper.toDomain(request).getEstadoPedido()));
	}

	@DeleteMapping("/eliminar/{idPedido}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarPedido(@PathVariable int idPedido) {
		pedidosUseCase.eliminarDetalle(idPedido, 0);
	}

	@PatchMapping("/validar/{idPedido}")
	@ResponseStatus(HttpStatus.OK)
	public PedidosResponseDto validarPedido(@PathVariable int idPedido, @RequestParam boolean estado) {
		return mapper
				.toResponse(estado ? pedidosUseCase.aprobarPedido(idPedido) : pedidosUseCase.rechazarPedido(idPedido));
	}

}
