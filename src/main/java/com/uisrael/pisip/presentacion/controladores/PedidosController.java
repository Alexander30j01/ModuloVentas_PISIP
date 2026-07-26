package com.uisrael.pisip.presentacion.controladores;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.pisip.aplicacion.casouso.entrada.IPedidosUseCase;
import com.uisrael.pisip.dominio.entidades.DetallePedido;
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

	@PostMapping
	public ResponseEntity<PedidosResponseDto> crearPedido(@Valid @RequestBody PedidosRequestDto request) {
		Pedido pedidoDominio = mapper.toDomain(request);
		Pedido pedidoCreado = pedidosUseCase.crearPedido(pedidoDominio);
		PedidosResponseDto response = mapper.toResponse(pedidoCreado);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<PedidosResponseDto>> listarPedido() {
		List<Pedido> pedidos = pedidosUseCase.listarPedido();
		List<PedidosResponseDto> response = pedidos.stream()
				.map(mapper::toResponse)
				.toList();
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/{idPedido}/detalles")
	public ResponseEntity<PedidosResponseDto> agregarDetalle(@PathVariable int idPedido, @RequestBody DetallePedido detalle) {
		Pedido pedidoActualizado = pedidosUseCase.agregarDetalle(idPedido, detalle);
		PedidosResponseDto response = mapper.toResponse(pedidoActualizado);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{idPedido}/calcular-total")
	public ResponseEntity<BigDecimal> calcularTotal(@PathVariable int idPedido) {
		BigDecimal total = pedidosUseCase.calcularTotal(idPedido);
		return ResponseEntity.ok(total);
	}
	
	@GetMapping("/{idPedido}/validar-stock")
	public ResponseEntity<Boolean> validarStock(@PathVariable int idPedido) {
		boolean tieneStock = pedidosUseCase.validarStock(idPedido);
		return ResponseEntity.ok(tieneStock);
	}

}
