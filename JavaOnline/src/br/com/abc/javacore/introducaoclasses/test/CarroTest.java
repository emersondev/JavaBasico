package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
	
	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		
		car1.placa = "AAA-1218";
		car1.modelo = "Kicks";
		car1.velocidadeMaxima = 200;
		
		System.out.println(car1.placa);
		System.out.println(car1.modelo);
		System.out.println(car1.velocidadeMaxima);
		
	}
	
}
