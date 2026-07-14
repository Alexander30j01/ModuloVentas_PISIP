package com.uisrael.pisip.presentacion.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.pisip.aplicacion.casouso.entrada.IProductoUseCase;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	private final IProductoUseCase productoUseCase;

	public ProductoController(IProductoUseCase productoUseCase) {
		this.productoUseCase = productoUseCase;
	}

	@PostMapping("/{id}/aumentar")
	public ResponseEntity<Void> aumentar(@PathVariable int id, @RequestParam int cantidad) {
		productoUseCase.aumentarStock(id, cantidad);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/disminuir")
	public ResponseEntity<Void> disminuir(@PathVariable int id, @RequestParam int cantidad) {
		productoUseCase.disminuirStock(id, cantidad);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/activar")
	public ResponseEntity<Void> activar(@PathVariable int id) {
		productoUseCase.activar(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/{id}/desactivar")
	public ResponseEntity<Void> desactivar(@PathVariable int id) {
		productoUseCase.desactivar(id);
		return ResponseEntity.noContent().build();
	}
}