package com.uisrael.pisip.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProductoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.ProductoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	private final IProductoUseCase productoUseCase;
	private final ProductoDtoMapper mapper;

	public ProductoController(IProductoUseCase productoUseCase, ProductoDtoMapper mapper) {
		this.productoUseCase = productoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoResponseDto registrar(@Valid @RequestBody ProductoRequestDto request) {
		return mapper.toResponse(productoUseCase.registrar(mapper.toDomain(request)));
	}

	@PutMapping
	public ProductoResponseDto actualizar(@Valid @RequestBody ProductoRequestDto request) {
		return mapper.toResponse(productoUseCase.actualizar(mapper.toDomain(request)));
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductoResponseDto> buscarPorId(@PathVariable int id) {
		return ResponseEntity.ok(mapper.toResponse(productoUseCase.buscarPorId(id)));
	}

	@GetMapping
	public List<ProductoResponseDto> listarTodo() {
		return productoUseCase.listarTodo().stream()
				.map(mapper::toResponse)
				.toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id) {
		productoUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/aumentar")
	public ResponseEntity<Void> aumentar(@PathVariable int id, @RequestParam int cantidad) {
		productoUseCase.aumentarStock(id, cantidad);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/disminuir")
	public ResponseEntity<Void> disminuir(@PathVariable int id, @RequestParam int cantidad) {
		productoUseCase.disminuirStock(id, cantidad);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/activar")
	public ResponseEntity<Void> activar(@PathVariable int id) {
		productoUseCase.activar(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/desactivar")
	public ResponseEntity<Void> desactivar(@PathVariable int id) {
		productoUseCase.desactivar(id);
		return ResponseEntity.noContent().build();
	}
}
