package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe de Teste Calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(6, 8);		
		Assertions.assertEquals(14, soma);		
	}
	
	@DisplayName("Testa a soma por numero negativo")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(-6, 8);		
		Assertions.assertEquals(2, soma);		
	}
	
	@DisplayName("Testa a subtracao")
	@Test
	public void testSubtracaoDoisNumeros() {
		int soma = calc.subtracao(8, 3);		
		Assertions.assertEquals(5, subtracao);	
		
	@DisplayName("Testa a divisão")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(4, 2);
		assertTrue(divisao == 2);
	}
	
	@DisplayName("Testa a multiplicacao")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int divisao = calc.multiplicacao(4, 2);
		Assertions.assertEquals(8, multiplicacao);
	}

