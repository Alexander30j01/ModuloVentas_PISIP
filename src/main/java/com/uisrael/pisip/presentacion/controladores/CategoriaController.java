package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.uisrael.pisip.aplicacion.casouso.entrada.ICategoriaUseCase;
import com.uisrael.pisip.dominio.entidades.Categoria;
import com.uisrael.pisip.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.CategoriaResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.ICategoriaDtoMapper;

import jakarta.validation.Valid;

public class CategoriaController {

	private final ICategoriaUseCase categoriaUseCase;
	private final ICategoriaDtoMapper mapper;

	public CategoriaController(ICategoriaUseCase categoriaUseCase, ICategoriaDtoMapper mapper) {
		super();
		this.categoriaUseCase = categoriaUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CategoriaResponseDto registrar(@Valid @RequestBody CategoriaRequestDto request) {
		return mapper.toResponseDto(categoriaUseCase.registrar(mapper.toDomain(request)));
	}

	@PutMapping
	public CategoriaResponseDto actualizar(@Valid @RequestBody CategoriaRequestDto request) {
		return mapper.toResponseDto(categoriaUseCase.actualizar(mapper.toDomain(request)));
	}

	@PutMapping("/{id}/estado")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void cambiarEstado(@PathVariable int id, @RequestParam boolean activo) {
		Categoria cliente = new Categoria();
		cliente.setIdCategoria(id);

		categoriaUseCase.cambiarEstado(cliente, activo);
	}

}
