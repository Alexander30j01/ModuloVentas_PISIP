package com.uisrael.pisip.presentacion.controladores;

import com.uisrael.pisip.aplicacion.casouso.entrada.IRegionUseCase;
import com.uisrael.pisip.dominio.entidades.Region;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regiones")
public class RegionController {

    private final IRegionUseCase regionUseCase;

    // Inyección del Caso de Uso (La capa de aplicación)
    public RegionController(IRegionUseCase regionUseCase) {
        this.regionUseCase = regionUseCase;
    }

    @PostMapping
    public ResponseEntity<Region> registrar(@RequestBody Region region) {
        return ResponseEntity.ok(regionUseCase.registrar(region));
    }

    @PutMapping
    public ResponseEntity<Region> actualizar(@RequestBody Region region) {
        return ResponseEntity.ok(regionUseCase.actualizar(region));
    }

    @PatchMapping("/{id}/activar")
    public ResponseEntity<Void> activar(@PathVariable int id) {
        regionUseCase.activar(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/desactivar")
    public ResponseEntity<Void> desactivar(@PathVariable int id) {
        regionUseCase.desactivar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok(regionUseCase.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Region>> listarTodas() {
        return ResponseEntity.ok(regionUseCase.listarTodas());
    }
}