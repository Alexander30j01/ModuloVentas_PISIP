package com.uisrael.pisip.presentacion.controladores;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IDetallePedidoUseCase;
import com.uisrael.pisip.dominio.entidades.DetallePedido;
import com.uisrael.pisip.presentacion.dto.request.DetallePedidoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DetallePedidoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.IDetallePedidoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/detallePedido")
public class DetallePedidoController {

	private final IDetallePedidoUseCase detallePedidoUseCase;
	private final IDetallePedidoDtoMapper mapper;

	public DetallePedidoController(IDetallePedidoUseCase detallePedidoUseCase, IDetallePedidoDtoMapper mapper) {
		super();
		this.detallePedidoUseCase = detallePedidoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	public ResponseEntity<DetallePedidoResponseDto> guardar(@Valid @RequestBody DetallePedidoRequestDto requestDto) {
		DetallePedido dominio = mapper.toDomain(requestDto);
		DetallePedido guardado = detallePedidoUseCase.guardar(dominio);
		return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponseDto(guardado));

	}

	@GetMapping("/{id}")
	public ResponseEntity<DetallePedidoResponseDto> buscarPorId(@PathVariable int id) {
		DetallePedido encontrado = detallePedidoUseCase.buscarPorId(id);
		return ResponseEntity.ok(mapper.toResponseDto(encontrado));
	}

	@GetMapping
	public ResponseEntity<List<DetallePedidoResponseDto>> listarTodos() {
		List<DetallePedidoResponseDto> respuesta = detallePedidoUseCase.listarTodos().stream()
				.map(mapper::toResponseDto).collect(Collectors.toList());
		return ResponseEntity.ok(respuesta);
	}

	@PutMapping("/{id}/estado")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void cambiarEstado(@PathVariable int id, @RequestParam boolean aprobado) {
		DetallePedido detallePedido = new DetallePedido();
		detallePedido.setIdDetallePedidos(id);

		detallePedidoUseCase.cambiarEstado(detallePedido, aprobado);
	}

}
