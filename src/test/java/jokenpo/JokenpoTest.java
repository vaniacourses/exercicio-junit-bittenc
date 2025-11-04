package jokenpo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

@DisplayName("Classe para teste do jokenpo")

public class JokenpoTest {
	
private Jokenpo joke;
	
	@BeforeEach
	public void inicializa() {
		joke = new Jokenpo();
	}
	
	@Test
	public void TesteEmpate1(){
		int emp = joke.jogar(1,1);
		Assertions.assertEquals(0, emp);
	}
	
	@Test
	public void TesteEmpate2(){
		int emp2 = joke.jogar(2,2);
		Assertions.assertEquals(0, emp2);
	}
	
	@Test
	public void TesteVJog1(){
		int VJog1 = joke.jogar(1,2);
		Assertions.assertEquals(1, VJog1 );
	}
	
	@Test
	public void TesteVJog2(){
		int VJog2 = joke.jogar(3,2);
		Assertions.assertEquals(2, VJog2 );
	}
	
}
