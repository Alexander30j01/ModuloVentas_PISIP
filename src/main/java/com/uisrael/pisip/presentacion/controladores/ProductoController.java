package com.uisrael.pisip.presentacion.controladores;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProductoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.ProductoDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	private final IProductoUseCase productoUseCase;
	private final ProductoDtoMapper mapper;

	public ProductoController(IProductoUseCase productoUseCase, ProductoDtoMapper mapper) {
		super();
		this.productoUseCase = productoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoResponseDto guardar(@Valid @RequestBody ProductoRequestDto request) {
		return mapper.toResponse(productoUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<ProductoResponseDto> listarTodo() {
		return productoUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idProducto) {
		productoUseCase.eliminar(idProducto);
		return ResponseEntity.noContent().build();
	}

}
