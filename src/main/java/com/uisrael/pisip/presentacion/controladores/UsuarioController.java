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

import com.uisrael.pisip.aplicacion.casouso.entrada.IUsuariosUseCase;
import com.uisrael.pisip.presentacion.dto.request.UsuariosRequestDto;
import com.uisrael.pisip.presentacion.dto.response.UsuariosResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.UsuariosDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	private final IUsuariosUseCase usuariosUseCase;
	private final UsuariosDtoMapper mapper;

	public UsuarioController(IUsuariosUseCase usuariosUseCase, UsuariosDtoMapper mapper) {
		super();
		this.usuariosUseCase = usuariosUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuariosResponseDto guardar(@Valid @RequestBody UsuariosRequestDto request) {
		return mapper.toResponse(usuariosUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<UsuariosResponseDto> listarTodo() {
		return usuariosUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idUsuarios) {
		usuariosUseCase.eliminar(idUsuarios);
		return ResponseEntity.noContent().build();
	}

}
