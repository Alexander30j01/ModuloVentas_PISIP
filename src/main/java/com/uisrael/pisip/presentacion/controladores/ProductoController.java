package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.pisip.dominio.entidades.Producto;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	private final IProductoUseCase productoUseCase;

    // Inyectamos el Caso de Uso (la lógica)
    public ProductoController(IProductoUseCase productoUseCase) {
        this.productoUseCase = productoUseCase;
    }

    @PostMapping
    public ResponseEntity<Producto> registrar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoUseCase.registrar(producto));
    }

    @PutMapping("/stock/{id}")
    public ResponseEntity<Void> aumentarStock(@PathVariable int id, @RequestParam int cantidad) {
        productoUseCase.aumentarStock(id, cantidad);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/activar")
    public ResponseEntity<Void> activar(@PathVariable int id) {
        productoUseCase.activar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/precio")
    public ResponseEntity<Float> consultarPrecio(@PathVariable int id) {
        return ResponseEntity.ok(productoUseCase.consultarPrecio(id));
    }
}