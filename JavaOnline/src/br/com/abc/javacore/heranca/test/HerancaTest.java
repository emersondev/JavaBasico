package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Endereco e1 = new Endereco();
		
		p1.setNome("Emer");
		p1.setCpf("123.123.123-12");
		e1.setBairro("Bairro Jackson");
		e1.setLogradouro("Rua Moonwalk");
		p1.setEndereco(e1);
		p1.print();
		
		System.out.println("\n");
		
		Funcionario f1 = new Funcionario("Capone");
		f1.setCpf("123.321.122-12");
		f1.setSalario(15000);
		f1.setEndereco(e1);
		f1.print();
	}

}
