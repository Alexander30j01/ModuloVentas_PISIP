package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IDocumentacionUseCase;
import com.uisrael.pisip.presentacion.dto.request.DocumentacionRequestDto;
import com.uisrael.pisip.presentacion.dto.response.DocumentacionResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.DocumentacionDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/documentacion")
public class DocumentacionController {

	private final IDocumentacionUseCase documentacionUseCase;
	private final DocumentacionDtoMapper mapper;

	public DocumentacionController(IDocumentacionUseCase documentacionUseCase, DocumentacionDtoMapper mapper) {
		super();
		this.documentacionUseCase = documentacionUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping("/subir")
	@ResponseStatus(HttpStatus.CREATED)
	public DocumentacionResponseDto subirDocumento(@Valid @RequestBody DocumentacionRequestDto request){
		return mapper.toResponse(documentacionUseCase.subir(mapper.toDomain(request)));
	}

}
