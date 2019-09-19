package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		
		Estudante e1 = new Estudante("0001", "Ken Master", new double[]{5, 2, 10});
		
		e1.imprime();
	}
	
}
