package br.com.abc.javacore.strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		/*
		 * m�todos mais utilizados na StringBuilder e StringBuffer
		 */
		String s = "uma frase comum";
		StringBuilder sb = new StringBuilder(10); // caso eu n�o passe como par�metro o tamanho dos caracteres, ele colocar 16 por padr�o
		sb.append("Uma frase comum"); // sempre que quiser adicionar uma String no String Builder use append
		s = sb.toString(); // String Builder n�o � uma string, mas o m�todo toString converte para String
		
		System.out.println(s);
		System.out.println(sb.reverse()); // inverte o String Builder todo
		System.out.println(sb.delete(0, 2)); // o �ltimo do array o java n�o considera
		System.out.println(sb.insert(2, "aaaa")); // insere a String que eu passei por par�metro na posi��o 3
		
	}
	
}
