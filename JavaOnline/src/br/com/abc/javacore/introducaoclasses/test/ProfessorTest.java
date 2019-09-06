package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
	
	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		Professor p2 = new Professor();
		
		p1.nome = "Mario";
		p1.matricula = "01";
		p1.rg = "12.115.152-x";
		p1.cpf = "481.151.231-95";
		
		p2.nome = "Superman";
		p2.matricula = "02";
		p2.rg = "12.115.134-x";
		p2.cpf = "443.123.231-95";
		
		System.out.println("Professor 1:");
		System.out.println(p1.nome);
		System.out.println(p1.matricula);
		System.out.println(p1.rg);
		System.out.println(p1.cpf);
		
		System.out.println("\n\nProfessor 2:");
		System.out.println(p2.nome);
		System.out.println(p2.matricula);
		System.out.println(p2.rg);
		System.out.println(p2.cpf);
		
	}
	
}
