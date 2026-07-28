package com.uisrael.pisip.presentacion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.uisrael.pisip.aplicacion.casouso.entrada.ISolicitudCreditoUseCase;
import com.uisrael.pisip.dominio.entidades.Documentacion;
import com.uisrael.pisip.dominio.entidades.SolicitudCredito;
import com.uisrael.pisip.presentacion.dto.request.SolicitudCreditoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.SolicitudCreditoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.SolicitudCreditoDtoMapper;

import jakarta.validation.Valid;

@RestController
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
	public ResponseEntity<SolicitudCreditoResponseDto> registrar(
			@Valid @RequestBody SolicitudCreditoRequestDto request) {
		SolicitudCredito dominio = mapper.toDomain(request);
		SolicitudCredito registrada = solicitudCreditoUseCase.registrar(dominio);
		return new ResponseEntity<>(mapper.toResponse(registrada), HttpStatus.CREATED);
	}

	@GetMapping("/{idSolicitud}")
	public ResponseEntity<SolicitudCreditoResponseDto> buscarPorId(@PathVariable int idSolicitud) {
		SolicitudCredito solicitud = solicitudCreditoUseCase.buscarPorId(idSolicitud);
		return ResponseEntity.ok(mapper.toResponse(solicitud));
	}

	@PatchMapping("/{idSolicitud}/aprobar")
	public ResponseEntity<SolicitudCreditoResponseDto> aprobar(@PathVariable int idSolicitud) {
		SolicitudCredito aprobada = solicitudCreditoUseCase.aprobar(idSolicitud);
		return ResponseEntity.ok(mapper.toResponse(aprobada));
	}

	@PatchMapping("/{idSolicitud}/rechazar")
	public ResponseEntity<SolicitudCreditoResponseDto> rechazar(@PathVariable int idSolicitud,
			@RequestParam String motivo) {
		SolicitudCredito rechazada = solicitudCreditoUseCase.rechazar(idSolicitud, motivo);
		return ResponseEntity.ok(mapper.toResponse(rechazada));
	}

	@GetMapping("/{idSolicitud}/validar-documentacion")
	public ResponseEntity<Boolean> validarDocumentacion(@PathVariable int idSolicitud) {
		boolean esValida = solicitudCreditoUseCase.validarDocumentacion(idSolicitud);
		return ResponseEntity.ok(esValida);
	}

	@PostMapping("/{idSolicitud}/documentos")
	public ResponseEntity<SolicitudCreditoResponseDto> agregarDocumento(@PathVariable int idSolicitud,
			@RequestBody Documentacion documento) {
		SolicitudCredito actualizada = solicitudCreditoUseCase.agregarDocumento(idSolicitud, documento);
		return ResponseEntity.ok(mapper.toResponse(actualizada));
	}

	@PatchMapping("/{idSolicitud}/estado")
	public ResponseEntity<SolicitudCreditoResponseDto> cambiarEstado(@PathVariable int idSolicitud,
			@RequestParam String nuevoEstado) {
		SolicitudCredito actualizada = solicitudCreditoUseCase.cambiarEstado(idSolicitud, nuevoEstado);
		return ResponseEntity.ok(mapper.toResponse(actualizada));
	}

	@GetMapping
	public List<SolicitudCreditoResponseDto> listarTodo() {
		return solicitudCreditoUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}
}
