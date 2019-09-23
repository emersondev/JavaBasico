package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.ClienteEstatico;

public class ClienteEstaticoTest {

	public static void main(String[] args) {
		
		ClienteEstatico c1 = new ClienteEstatico();
		ClienteEstatico c2 = new ClienteEstatico();
		ClienteEstatico c3 = new ClienteEstatico();
		
		System.out.println("Tamanho: " + ClienteEstatico.getParcelas().length); // criamos 

	}

}
