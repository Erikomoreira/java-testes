package testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora c = new Calculadora();
		int soma = c.somar("1+1+3");
		assertEquals(5, soma);
		
	}

}
