package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		// Alterei o valor da variável antes de ela ser compilada
		// Caso a variável estiver como private, mesmo usando o get e set não é possível alterar ela
		
//		Carro c1 = new Carro("BMW", 280);
//		Carro c2 = new Carro("Jaguar", 250);
//		Carro c3 = new Carro("Porsche", 290);
//		
//		c1.imprime();
//		c2.imprime();
//		c3.imprime();
//		
//		System.out.println("##################################");
//		
//		c1.imprime();
//		c2.imprime();
//		c3.imprime();
		
		
		// porque consigo acessar o método sem ter objeto?
		// todo método estático é carregado junto com a classe sem a necessidade de criar um objeto para instanciá-lo e/ou usá-lo
		System.out.println(Carro.getVelocidadeLimite());
		
		
		
	}

}
