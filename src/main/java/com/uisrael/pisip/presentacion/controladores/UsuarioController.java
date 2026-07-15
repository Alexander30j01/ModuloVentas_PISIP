package com.uisrael.pisip.presentacion.controladores;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PutMapping("/{id}/iniciarSesion")
	public UsuariosResponseDto iniciarSesion(@PathVariable("id") int idUsuario) {

	    return mapper.toResponse(
	            usuariosUseCase.iniciarSesion(idUsuario));

	}
	
	@PutMapping("/{id}/cerrarSesion")
	public UsuariosResponseDto cerrarSesion(@PathVariable("id") int idUsuario) {

	    return mapper.toResponse(
	            usuariosUseCase.cerrarSesion(idUsuario));

	}
	
	@PutMapping("/{id}/actualizarPerfil")
	public UsuariosResponseDto actualizarPerfil(
	        @PathVariable("id") int idUsuario,
	        @Valid @RequestBody UsuariosRequestDto request) {

	    return mapper.toResponse(
	            usuariosUseCase.actualizarPerfil(idUsuario, mapper.toDomain(request)));

	}
	
	@PutMapping("/{id}/cambiarContrasena")
	public UsuariosResponseDto cambiarContrasena(
	        @PathVariable("id") int idUsuario,
	        @RequestParam String nuevaContrasena) {

	    return mapper.toResponse(
	            usuariosUseCase.cambiarContrasena(idUsuario, nuevaContrasena));

	}
	@PutMapping("/{id}/asignarRol")
	public UsuariosResponseDto asignarRol(
	        @PathVariable("id") int idUsuario,
	        @RequestParam String rol) {

	    return mapper.toResponse(
	            usuariosUseCase.asignarRol(idUsuario, rol));

	}
	
	@PutMapping("/{id}/asignarRegion")
	public UsuariosResponseDto asignarRegion(
	        @PathVariable("id") int idUsuario,
	        @RequestParam String region) {

	    return mapper.toResponse(
	            usuariosUseCase.asignarRegion(idUsuario, region));

	}
	
	@PutMapping("/{id}/activar")
	public UsuariosResponseDto activar(@PathVariable("id") int idUsuario) {

	    return mapper.toResponse(
	            usuariosUseCase.activar(idUsuario));

	}
	
	@PutMapping("/{id}/desactivar")
	public UsuariosResponseDto desactivar(@PathVariable("id") int idUsuario) {

	    return mapper.toResponse(
	            usuariosUseCase.desactivar(idUsuario));

	}
	
	@PutMapping("/{id}/generarReporteVisitas")
	public UsuariosResponseDto generarReporteVisitas(@PathVariable("id") int idUsuario) {

	    return mapper.toResponse(
	            usuariosUseCase.generarReporteVisitas(idUsuario));

	}

}
