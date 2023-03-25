package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
	private Calculadora calc;
	
	
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		//definir cenário
		int resultadoEsperado = 0;
		
		//executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();
		
		//comparar
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	@Test
	public void testConstrutorComParametro() {
		Calculadora calc = new Calculadora(3);
		assertEquals(3, calc.getMemoria());
	}
	@Test
	public void testSomarNumeroNegativo() {
		Calculadora calc = new Calculadora(3);
		calc.somar(-2);
		assertEquals(3, calc.getMemoria());
	}
	@Test
	public void testSubtrairNumeroPositivo() {
		Calculadora calc = new Calculadora(3);
		calc.subtrair(10);
		assertEquals(7, calc.getMemoria());
	}
	@Test
	public void testMultiplicarNumeroPositivo() {
		Calculadora calc = new Calculadora(3);
		calc.multiplicar(2);
		assertEquals(8, calc.getMemoria());
	}

	@Test
	public void testDividirPorValorPositivo() throws Exception{
		Calculadora calc = new Calculadora(22);
		calc .dividir(11);
		int resultadoEsperado=1;
		int resultadoObtido=calc.getMemoria();
		assertEquals(resultadoEsperado,resultadoObtido);

	}
	@Test
	public void testExponenciarPor1() {
		Calculadora calc = new Calculadora();

		assertThrows(Exception.class, ()->calc.exponenciar(1));
	}

	@Test
	public void testExponenciarPor10() {
		Calculadora calc = new Calculadora(10);

		assertThrows(Exception.class, ()->calc.exponenciar(20));
	}

}
