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

import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.presentacion.dto.request.SolicitudCreditoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.SolicitudCreditoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.SolicitudCreditoDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/solicitudCredito")
public class SolicitudCreditoController {

	private final ISolicitudCreditoUseCase solicitudCreditoUseCase;
	private final SolicitudCreditoDtoMapper mapper;

	public SolicitudCreditoController(ISolicitudCreditoUseCase solicitudCreditoUseCase,
			SolicitudCreditoDtoMapper mapper) {
		super();
		this.solicitudCreditoUseCase = solicitudCreditoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SolicitudCreditoResponseDto guardar(@Valid @RequestBody SolicitudCreditoRequestDto request) {
		return mapper.toResponse(solicitudCreditoUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<SolicitudCreditoResponseDto> listarTodo() {
		return solicitudCreditoUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idSolicitudCredito) {
		solicitudCreditoUseCase.eliminar(idSolicitudCredito);
		return ResponseEntity.noContent().build();
	}

}
