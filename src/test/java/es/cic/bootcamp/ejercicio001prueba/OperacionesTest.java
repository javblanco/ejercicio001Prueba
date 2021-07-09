package es.cic.bootcamp.ejercicio001prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSuma() {
		Operaciones operaciones = new Operaciones();
		
		int a = 4;
		int n2 = 5; 
		
		int resultado = operaciones.suma(a, n2);
		
		assertEquals(9, resultado, "La suma no es correcta");
	}
}
