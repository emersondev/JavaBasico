package br.com.abc.javacore.modificadorfinal.test;

import br.com.abc.javacore.modificadorfinal.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {

		Carro c = new Carro();
		c.getComprador().setNome("Zoro"); // não posso criar um objeto de comprador mas posso setar o parâmetro direto
		System.out.println(Carro.VELOCIDADE_FINAL);

	}

}
