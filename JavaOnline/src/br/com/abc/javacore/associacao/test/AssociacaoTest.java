package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.classes.Aluno;
import br.com.abc.javacore.associacao.classes.Local;
import br.com.abc.javacore.associacao.classes.Professor;
import br.com.abc.javacore.associacao.classes.Seminario;

public class AssociacaoTest {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Emerson", 26);
		Aluno a2 = new Aluno("Pedro", 26);
		
		Seminario sem = new Seminario("Estudando java");
		Professor prof = new Professor("Marião", "Engenheiro de Software");
		Local local = new Local("Rua dos céus", "heaven");
		
		a1.setSeminario(sem);
		a2.setSeminario(sem);
		
		sem.setProfessor(prof);
		sem.setLocal(local);
		sem.setAlunos(new Aluno[] {a1, a2});
		
		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		prof.setSeminarios(semArray);
		
		sem.print();
		prof.print();
		
	}
	
}
