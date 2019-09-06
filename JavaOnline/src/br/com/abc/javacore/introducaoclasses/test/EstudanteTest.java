package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		
		Estudante e1 = new Estudante();
		
		e1.nome = "John";
		e1.matricula = "1000";
		e1.idade = 10;
		
		System.out.println(e1.nome);
		System.out.println(e1.matricula);
		System.out.println(e1.idade);
		
	}
	
}
