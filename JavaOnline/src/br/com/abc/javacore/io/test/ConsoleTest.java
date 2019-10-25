package br.com.abc.javacore.io.test;

import java.io.Console;

// essa classe só funciona no terminal 
public class ConsoleTest {

	public static void main(String[] args) {

		Console c1 = System.console();
		// não usar String para readPassword por causa do String Pool
		char[] pw = c1.readPassword("%s", "pw: "); // %s diz que estamos pegando uma String e passsando para um array de char
		for(char pass : pw) {
			c1.format("%c", pass); // a saída estamos formatando para char
		}
		
		c1.format("\n");
		String texto;
		while(true) {
			texto = c1.readLine("%s", "Digite: ");
			c1.format("esse texto %s foi digitado", retorno(texto)); // %s pega a String (no caso a variável texto)
		}

	}
	
	public static String retorno(String arg1) {
		return arg1;
	}

}
