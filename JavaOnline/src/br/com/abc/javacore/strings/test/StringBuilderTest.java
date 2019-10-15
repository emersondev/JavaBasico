package br.com.abc.javacore.strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		/*
		 * métodos mais utilizados na StringBuilder e StringBuffer
		 */
		String s = "uma frase comum";
		StringBuilder sb = new StringBuilder(10); // caso eu não passe como parâmetro o tamanho dos caracteres, ele colocar 16 por padrão
		sb.append("Uma frase comum"); // sempre que quiser adicionar uma String no String Builder use append
		s = sb.toString(); // String Builder não é uma string, mas o método toString converte para String
		
		System.out.println(s);
		System.out.println(sb.reverse()); // inverte o String Builder todo
		System.out.println(sb.delete(0, 2)); // o último do array o java não considera
		System.out.println(sb.insert(2, "aaaa")); // insere a String que eu passei por parâmetro na posição 3
		
	}
	
}
