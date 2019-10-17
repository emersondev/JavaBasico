package br.com.abc.javacore.expressoesregulares.test;

public class TokenTest {
	
	public static void main(String[] args) {
		
		String str = "Emerson, Tom, Wild, Bill, Hiccup, Ana, John, Matheus";
		String[] tokens = str.split(","); // retorna um array de String de acordo com o delimitador
		for(String arr: tokens) {
			System.out.println(arr.trim());
		}
	}
	
}
