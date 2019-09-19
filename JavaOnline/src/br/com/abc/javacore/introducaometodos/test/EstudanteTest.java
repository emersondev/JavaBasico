package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		
		Estudante e1 = new Estudante();
		
		e1.setNome("Marlênia");
		e1.setIdade(25);
		e1.calcularMedia(5, 9, 3);
		e1.imprimeDados();
	}

}
