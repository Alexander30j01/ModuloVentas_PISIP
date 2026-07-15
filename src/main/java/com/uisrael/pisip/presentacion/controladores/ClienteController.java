package com.uisrael.pisip.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.uisrael.pisip.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.pisip.dominio.entidades.Cliente;
import com.uisrael.pisip.dominio.entidades.Pedidos;
import com.uisrael.pisip.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.pisip.presentacion.dto.response.ClienteResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.IClienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	private final IClienteUseCase clienteUseCase;
	private final IClienteDtoMapper mapper;

	public ClienteController(IClienteUseCase clienteUseCase, IClienteDtoMapper mapper) {
		this.clienteUseCase = clienteUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteResponseDto registrar(@Valid @RequestBody ClienteRequestDto request) {
		return mapper.toResponseDto(clienteUseCase.registrar(mapper.toDomain(request)));
	}

	@PutMapping
	public ClienteResponseDto actualizar(@Valid @RequestBody ClienteRequestDto request) {
		return mapper.toResponseDto(clienteUseCase.actualizar(mapper.toDomain(request)));
	}

	@GetMapping("/{id}/solicitar-credito")
	public boolean solicitarCredito(@PathVariable int id, @RequestParam double monto) {
		return clienteUseCase.solicitarCredito(id, monto);
	}

	@GetMapping("/{id}/credito-aprobado")
	public boolean tieneCreditoAprobado(@PathVariable int id) {
		return clienteUseCase.tieneCreditoAprobado(id);
	}

	@GetMapping("/{id}/pedidos")
	public List<Pedidos> consultarHistorial(@PathVariable int id) {
		return clienteUseCase.consultarHistorial(id);
	}

	@PutMapping("/{id}/estado")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void cambiarEstado(@PathVariable int id, @RequestParam boolean activo) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(id);

		clienteUseCase.cambiarEstado(cliente, activo);
	}
}