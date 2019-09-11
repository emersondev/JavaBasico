package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();	
		
		c1.somaDoisNumeros();
		c1.subtraiDoisNumeros();
		c1.multiplicaDoisNumeros(12, 10);
		System.out.println(c1.divideDoisNumeros(12, 2));
		c1.somaVarArgs(1,2,3,4,5,6,7,8,9,10,1000);
	}

}
