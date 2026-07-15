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
import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.presentacion.dto.request.DetallePedidoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DetallePedidoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.DetallePedidoDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/detallePedido")
public class DetallePedidoController {

	private final IDetallePedidoUseCase detallePedidoUseCase;
	private final DetallePedidoDtoMapper mapper;

	public DetallePedidoController(IDetallePedidoUseCase detallePedidoUseCase, DetallePedidoDtoMapper mapper) {
		this.detallePedidoUseCase = detallePedidoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DetallePedidoResponseDto guardar(@Valid @RequestBody DetallePedidoRequestDto request) {
		return mapper.toResponse(detallePedidoUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<DetallePedidoResponseDto> listarTodo() {
		return detallePedidoUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idDetallePedido) {
		detallePedidoUseCase.eliminar(idDetallePedido);
		return ResponseEntity.noContent().build();
	}

}
