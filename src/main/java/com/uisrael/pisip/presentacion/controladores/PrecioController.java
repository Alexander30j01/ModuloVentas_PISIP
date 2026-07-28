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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPrecioUseCase;
import com.uisrael.pisip.dominio.entidades.Precio;
import com.uisrael.pisip.presentacion.dto.request.PrecioRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PrecioResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.PrecioDtoMapper;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/precio")
public class PrecioController {
	
	private final IPrecioUseCase precioUseCase;
	private final PrecioDtoMapper mapper;

	public PrecioController(IPrecioUseCase precioUseCase, PrecioDtoMapper mapper) {
		this.precioUseCase = precioUseCase;
		this.mapper = mapper;
	}
	@PostMapping
	public ResponseEntity<PrecioResponseDto> crearPrecio(@Valid @RequestBody PrecioRequestDto request) {
		Precio precioDominio = mapper.toDomain(request);
		Precio precioCreado = precioUseCase.crearPrecio(precioDominio);
		return new ResponseEntity<>(mapper.toResponse(precioCreado), HttpStatus.CREATED);
	}
	
	@GetMapping("/activo")
	public ResponseEntity<PrecioResponseDto> obtenerActivo() {
		Precio precio = precioUseCase.obtenerActivo();
		if (precio == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(mapper.toResponse(precio));
	}
	
	@GetMapping("/{idPrecio}")
	public ResponseEntity<PrecioResponseDto> buscarPorId(@PathVariable int idPrecio) {
		Precio precio = precioUseCase.buscarPorId(idPrecio);
		if (precio == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(mapper.toResponse(precio));
	}
	
	@GetMapping
	public ResponseEntity<List<PrecioResponseDto>> listarTodos() {
		List<Precio> precios = precioUseCase.listarTodos();
		List<PrecioResponseDto> response = precios.stream()
				.map(mapper::toResponse)
				.toList();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/calcular-iva")
	public ResponseEntity<BigDecimal> calcularIva(@RequestParam BigDecimal montoBase) {
		BigDecimal iva = precioUseCase.calcularIva(montoBase);
		return ResponseEntity.ok(iva);
	}
	
	@GetMapping("/calcular-total")
	public ResponseEntity<BigDecimal> calcularPrecioConIva(@RequestParam BigDecimal montoBase) {
		BigDecimal total = precioUseCase.calcularPrecioConIva(montoBase);
		return ResponseEntity.ok(total);
	}

}
