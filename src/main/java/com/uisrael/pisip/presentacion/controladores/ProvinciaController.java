package com.uisrael.pisip.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IProvinciaUseCase;
import com.uisrael.pisip.dominio.entidades.Provincia;
import com.uisrael.pisip.presentacion.dto.request.ProvinciaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ProvinciaResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.IProvinciaDtoMapper;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {
	private final IProvinciaUseCase provinciaUseCase;
	private final IProvinciaDtoMapper mapper;
	
	public ProvinciaController(IProvinciaUseCase provinciaUseCase, IProvinciaDtoMapper mapper) {
		super();
		this.provinciaUseCase = provinciaUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProvinciaResponseDto registrar(@Valid @RequestBody ProvinciaRequestDto request) {
		return mapper.toResponseDto(provinciaUseCase.registrar(mapper.toDomain(request)));
	}

	@PutMapping
	public ProvinciaResponseDto actualizar(@Valid @RequestBody ProvinciaRequestDto request) {
		return mapper.toResponseDto(provinciaUseCase.actualizar(mapper.toDomain(request)));
	}

	@GetMapping("/nombre/{nombre}")
	public ProvinciaResponseDto buscarPorNombre(@PathVariable String nombre) {
		return mapper.toResponseDto(provinciaUseCase.buscarPorNombre(nombre));
	}

	@GetMapping("/{id}")
	public ProvinciaResponseDto obtenerPorId(@PathVariable("id") Integer idProvincia) {
		return mapper.toResponseDto(provinciaUseCase.obtenerPorId(idProvincia));
	}

	@PutMapping("/{id}/estado")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void cambiarEstado(@PathVariable("id") int id, @RequestParam boolean activo) {
		Provincia provincia = new Provincia();
		provincia.setIdProvincia(id);
		provinciaUseCase.cambiarEstado(provincia, activo);
	}

	@GetMapping
	public List<ProvinciaResponseDto> listarTodo() {
		return provinciaUseCase.listarTodo().stream().map(mapper::toResponseDto).toList();
	}

}
