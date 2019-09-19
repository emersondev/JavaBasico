package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario("John Bain", "133.456.789-97", "79.543.147-8", 8000);
		
		f1.init("João Bolão", "151.147.847-87", "74.154.639-X", 4900);
		
		f1.imprime();
		f2.imprime();
	}
	
}
