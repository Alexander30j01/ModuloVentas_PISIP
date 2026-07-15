package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public DocumentacionResponseDto subirDocumento(@Valid @RequestBody DocumentacionRequestDto request) {
		return mapper.toResponse(documentacionUseCase.subir(mapper.toDomain(request)));
	}

	@PutMapping("/actualizar/{idDocumentacion}")
	@ResponseStatus(HttpStatus.OK)
	public DocumentacionResponseDto actualizarDocumento(@PathVariable int idDocumentacion,
			@Valid @RequestBody DocumentacionRequestDto request) {
		return mapper.toResponse(documentacionUseCase.actualizar(idDocumentacion, mapper.toDomain(request)));
	}

	@DeleteMapping("/eliminar/{idDocumentacion}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarDocumento(@PathVariable int idDocumentacion) {
		documentacionUseCase.eliminarDocumento(idDocumentacion);
	}

	@PatchMapping("/validar/{idDocumentacion}")
	@ResponseStatus(HttpStatus.OK)
	public DocumentacionResponseDto validarDocumento(@PathVariable int idDocumentacion, @RequestParam boolean estado) {
		return mapper.toResponse(documentacionUseCase.validarDocumento(idDocumentacion, estado));
	}

}
