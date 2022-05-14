package br.com.alura.tdd.calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		//compara se é igual
		Assert.assertEquals(10, soma);
	}

}
