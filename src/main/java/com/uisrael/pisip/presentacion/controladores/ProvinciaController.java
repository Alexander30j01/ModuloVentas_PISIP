package com.uisrael.pisip.presentacion.controladores;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProvinciaUseCase;
import com.uisrael.pisip.presentacion.dto.request.ProvinciaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProvinciaResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.IProvinciaDtoMapper;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/provincias")
public class ProvinciaController {
	private final IProvinciaUseCase provinciaUseCase;
	private final IProvinciaDtoMapper mapper;
	
	public ProvinciaController(IProvinciaUseCase provinciaUseCase, IProvinciaDtoMapper mapper) {
		super();
		this.provinciaUseCase = provinciaUseCase;
		this.mapper = mapper;
	}
	
	public ProvinciaResponseDto registrar(@Valid @RequestBody ProvinciaRequestDto request) {
		return mapper.toResponseDto(provinciaUseCase.registrar(mapper.toDomain(request)));
	}

}
