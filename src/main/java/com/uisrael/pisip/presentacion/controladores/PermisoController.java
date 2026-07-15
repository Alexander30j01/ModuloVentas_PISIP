package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IPermisoUseCase;
import com.uisrael.pisip.presentacion.dto.request.PermisoRequestDto;
import com.uisrael.pisip.presentacion.dto.response.PermisoResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.PermisoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/permisos")
public class PermisoController {
	private final IPermisoUseCase permisoUseCase;
	private final PermisoDtoMapper mapper;

	public PermisoController(IPermisoUseCase permisoUseCase, PermisoDtoMapper mapper) {
		super();
		this.permisoUseCase = permisoUseCase;
		this.mapper = mapper;
	}

	@PutMapping("/actualizar-nombre/{idPermiso}")
	@ResponseStatus(HttpStatus.OK)
	public PermisoResponseDto actualizarNombre(@PathVariable int idPermiso,
			@Valid @RequestBody PermisoRequestDto request) {
		return mapper.toResponse(permisoUseCase.actualizarNombre(idPermiso, request.getNombre()));
	}

	@PutMapping("/actualizar-descripcion/{idPermiso}")
	@ResponseStatus(HttpStatus.OK)
	public PermisoResponseDto actualizarDescripcion(@PathVariable int idPermiso,
			@Valid @RequestBody PermisoRequestDto request) {
		return mapper.toResponse(permisoUseCase.actualizarDescripcion(idPermiso, request.getDescripcion()));
	}

	@PutMapping("/activar/{idPermiso}")
	@ResponseStatus(HttpStatus.OK)
	public PermisoResponseDto activar(@PathVariable int idPermiso) {
		return mapper.toResponse(permisoUseCase.activar(idPermiso));
	}

	@PutMapping("/desactivar/{idPermiso}")
	@ResponseStatus(HttpStatus.OK)
	public PermisoResponseDto desactivar(@PathVariable int idPermiso) {
		return mapper.toResponse(permisoUseCase.desactivar(idPermiso));
	}

}
