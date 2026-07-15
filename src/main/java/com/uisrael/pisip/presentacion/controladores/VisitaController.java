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
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.pisip.aplicacion.casouso.entrada.IVisitaUseCase;
import com.uisrael.pisip.presentacion.dto.request.VisitaRequestDto;
import com.uisrael.pisip.presentacion.dto.response.VisitaResponseDto;
import com.uisrael.pisip.presentacion.mapeadores.VisitaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/visita")
public class VisitaController {

    private final IVisitaUseCase visitaUseCase;
    private final VisitaDtoMapper mapper;

    public VisitaController(IVisitaUseCase visitaUseCase,
            VisitaDtoMapper mapper) {
        this.visitaUseCase = visitaUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitaResponseDto guardar(@Valid @RequestBody VisitaRequestDto request) {
        return mapper.toResponse(visitaUseCase.guardar(mapper.toDomain(request)));
    }

    @GetMapping
    public List<VisitaResponseDto> listarTodo() {
        return visitaUseCase.listarTodos()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int idVisita) {
        visitaUseCase.eliminar(idVisita);
        return ResponseEntity.noContent().build();
    }

}
