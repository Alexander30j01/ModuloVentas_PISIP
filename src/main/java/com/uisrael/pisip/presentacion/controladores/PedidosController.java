package com.uisrael.pisip.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PedidosResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.PedidosDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
	private final IPedidosUseCase pedidoUseCase;
	private final PedidosDtoMapper mapper;

	public PedidosController(IPedidosUseCase pedidoUseCase, PedidosDtoMapper mapper) {
		super();
		this.pedidoUseCase = pedidoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PedidosResponseDto guardar(@Valid @RequestBody PedidosRequestDto request) {
		return mapper.toResponse(pedidoUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<PedidosResponseDto> listarTodo() {
		return pedidoUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idPedidos) {
		pedidoUseCase.eliminar(idPedidos);
		return ResponseEntity.noContent().build();
	}

}
