package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		// Alterei o valor da vari�vel antes de ela ser compilada
		// Caso a vari�vel estiver como private, mesmo usando o get e set n�o � poss�vel alterar ela
		
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
		
		
		// porque consigo acessar o m�todo sem ter objeto?
		// todo m�todo est�tico � carregado junto com a classe sem a necessidade de criar um objeto para instanci�-lo e/ou us�-lo
		System.out.println(Carro.getVelocidadeLimite());
		
		
		
	}

}
