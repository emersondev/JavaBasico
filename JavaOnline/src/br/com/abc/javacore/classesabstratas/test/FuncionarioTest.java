package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Emerson", "20102-2", 2000);
		Vendedor v1 = new Vendedor("Carla", "22114-8", 1500, 5000);
		
		g1.calculaSalario();
		v1.calculaSalario();
		
		g1.print();
		System.out.println("\n----------------------\n");
		v1.print();
	}
	
}
