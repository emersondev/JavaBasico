package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.Funcionario;
import br.com.abc.javacore.polimorfismo.classes.Gerente;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Agnaldo", 5000, 2000);
		Vendedor v1 = new Vendedor("Yuri", 2000, 20000);
		Funcionario f1 = new Gerente("Tutas", 5000, 1000);
		Funcionario f2 = new Vendedor("Davi", 2000, 10000);
		
		RelatorioPagamento relatorio = new RelatorioPagamento();
//		relatorio.relatorioPagamentoGerente(g1);
//		System.out.println("\n");
//		relatorio.relatorioPagamentoVendedor(v1);
		relatorio.relatorioPagamentoGenerico(g1);
		System.out.println("\n");
		relatorio.relatorioPagamentoGenerico(v1);
		System.out.println("\n");
		relatorio.relatorioPagamentoGenerico(f1);
		System.out.println("\n");
		relatorio.relatorioPagamentoGenerico(f2);
		
		System.out.println("#################################### EXEMPLO ####################################");
		
		Funcionario f = g1; // variável de referência só diz quais são os métodos e atributos, e ele apontou para o objeto de gerente
		System.out.println(f.getSalario());
		
		
	}

}
