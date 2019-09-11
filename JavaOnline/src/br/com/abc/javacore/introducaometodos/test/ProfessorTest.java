package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
	
	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		
		p1.nome = "Fight";
		p1.matricula = "01";
		p1.cpf = "321.323.324-32";
		p1.rg = "23.321.213-43";
		
		p1.imprime();
		
	}
	
}
