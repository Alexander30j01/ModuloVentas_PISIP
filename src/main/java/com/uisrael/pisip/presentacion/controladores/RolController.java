package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.pisip.aplicacion.casouso.entrada.IRolUseCase;
import com.uisrael.pisip.presentacion.dto.request.RolRequestDto;
import com.uisrael.pisip.presentacion.dto.response.RolResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.IRolDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private final IRolUseCase rolUseCase;
    private final IRolDtoMapper mapper;

    public RolController(IRolUseCase rolUseCase, IRolDtoMapper mapper) {
        super();
        this.rolUseCase = rolUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RolResponseDto registrar(@Valid @RequestBody RolRequestDto request) {
        return mapper.toResponseDto(rolUseCase.registrar(mapper.toDomain(request)));
    }

    @PutMapping
    public RolResponseDto actualizar(@Valid @RequestBody RolRequestDto request) {
        return mapper.toResponseDto(rolUseCase.actualizar(mapper.toDomain(request)));
    }

    @PutMapping("/{id}/agregar-permiso")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void agregarPermiso(@PathVariable int id, @RequestParam int idPermiso) {
        rolUseCase.agregarPermiso(id, idPermiso);
    }

    @PutMapping("/{id}/quitar-permiso")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void quitarPermiso(@PathVariable int id, @RequestParam int idPermiso) {
        rolUseCase.quitarPermiso(id, idPermiso);
    }

    @PutMapping("/{id}/activar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void activar(@PathVariable int id) {
        rolUseCase.activar(id);
    }

    @PutMapping("/{id}/desactivar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desactivar(@PathVariable int id) {
        rolUseCase.desactivar(id);
    }
}