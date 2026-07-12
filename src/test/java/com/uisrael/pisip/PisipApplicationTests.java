package com.uisrael.pisip;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.pisip.infraestructura.persistencia.jpa.UsuariosEntity;

@SpringBootTest
class PisipApplicationTests {
	

	@Test
	void contextLoads() {
		UsuariosEntity nuevo = new UsuariosEntity();
		nuevo.setNombre(null);
		nuevo.setApellido(null);
		System.out.println(nuevo.getNombre()+ " "+ nuevo.getApellido());
	}
}
