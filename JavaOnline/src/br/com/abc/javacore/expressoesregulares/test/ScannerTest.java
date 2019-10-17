package br.com.abc.javacore.expressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("1 true 100 oi"); // a classe Scanner usa como delimitador o espa�o por padr�o, caso queira utilizar outro usar o m�todo userDelemiter
		while(scanner.hasNext()) { // hasNext verifica aqui dentro de scanner com o delimitador uma pr�xima posi��o // n�o muda o �ndice
			System.out.println(scanner.next()); // pra pegar o valor mudar e mudar o �ndice
		}
		System.out.println("###########################");
		Scanner scanner2 = new Scanner("1 true 100 oi");
		while(scanner2.hasNext()) {
			if(scanner2.hasNextInt()) {
				int i = scanner2.nextInt();
				System.out.println("int" + i);
			}else if(scanner2.hasNextBoolean()) {
				boolean b = scanner2.nextBoolean();
				System.out.println(b);
			}else{
				System.out.println(scanner2.next());
			}
			
		}
	}
	
}
