package br.com.abc.javacore.strings.test;

public class StringTest {

	public static void main(String[] args) {

		// strings s�o imut�veis
		String nome = "Emerson";
		nome.concat(" Novais"); // ele cria uma nova String em mem�ria
		System.out.println(nome); // como " Novais" estava em mem�ria, e ele foi chamado de novo, perdeu o concat
		
		String nome1 = "Corleone";
		String nome2 = "corleone";
		String nome3 = " corleone   ";		
		
		System.out.println(nome1.charAt(1));
		System.out.println(nome2.equalsIgnoreCase(nome1));
		System.out.println(nome2.length()); // length na String � m�todo
		System.out.println(nome1.replace("o", "a"));
		System.out.println(nome1.toLowerCase());
		System.out.println(nome1.toUpperCase());
		System.out.println(nome1.substring(0,2)); // o �ltimo do array o java n�o considera
		System.out.println("nome3:" + nome3.trim()); // remove os espa�os da String no come�o e no final dela

	}

}
