package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("John Konnor");
		p1.setIdade(400);
		p2.setNome("Madonna");
		p2.setIdade(8000);
		
		System.out.println(p1);
		System.out.println(p2);
	}
	
}
