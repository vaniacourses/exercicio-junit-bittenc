@Test
@DisplayName("Soma com número negativo")
public void testSomaComNegativo() {
    assertEquals(1, calc.soma(5, -4));
}

@Test
@DisplayName("Subtração de dois números")
public void testSubtracao() {
    assertEquals(2, calc.subtrai(5, 3));
}

@Test
@DisplayName("Subtração com número negativo")
public void testSubtracaoComNegativo() {
    assertEquals(8, calc.subtrai(5, -3));
}

@Test
@DisplayName("Multiplicação de dois números")
public void testMultiplicacao() {
    assertEquals(20, calc.multiplica(4, 5));
}

@Test
@DisplayName("Multiplicação por zero")
public void testMultiplicacaoPorZero() {
    assertEquals(0, calc.multiplica(4, 0));
}

@Test
@DisplayName("Multiplicação com número negativo")
public void testMultiplicacaoComNegativo() {
    assertEquals(-20, calc.multiplica(-4, 5));
}

@Test
@DisplayName("Divisão com resultado negativo")
public void testDivisaoComNegativo() {
    assertEquals(-2, calc.divisao(-10, 5));
}

@Test
@DisplayName("Divisão com resultado decimal truncado")
public void testDivisaoComTruncamento() {
    assertEquals(2, calc.divisao(5, 2)); // int/int retorna int
}
