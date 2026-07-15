package com.uisrael.pisip.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.uisrael.pisip.aplicacion.casouso.entrada.IClientesUseCase;
import com.uisrael.pisip.presentacion.dto.request.ClientesRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ClientesResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.ClientesDtoMapper;

import jakarta.validation.Valid;

//@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
	private final IClientesUseCase clientesUseCase;
	private final ClientesDtoMapper mapper;

	public ClientesController(IClientesUseCase clientesUseCase, ClientesDtoMapper mapper) {
		super();
		this.clientesUseCase = clientesUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClientesResponseDto guardar(@Valid @RequestBody ClientesRequestDto request) {
		return mapper.toResponse(clientesUseCase.guardar(mapper.toDomain(request)));
	}

	@GetMapping
	public List<ClientesResponseDto> listarTodo() {
		return clientesUseCase.listarTodos().stream().map(mapper::toResponse).toList();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int idClientes) {
		clientesUseCase.eliminar(idClientes);
		return ResponseEntity.noContent().build();
	}

}
