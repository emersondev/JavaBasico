package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares2Test {

	public static void main(String[] args) {
		// \d - todos os d�gito
		// \D - tudo o que n�o for d�gito
		// \s - espa�os em branco ---> s�o considerados espa�os em branco \t \n \r \f
		// \S - caracter que n�o � branco
		// \w - caracteres de palavras a-z, A-Z e digitos e _
		// \W - tudo que n�o for caracter de palavra
		
		String regex = "\\w"; // temos que escapar
		String texto = "a48gre651ger#!@g65\r_"; // as regex n�o utilizam o caracter que j� deu match
		Pattern pattern = Pattern.compile(regex); // compilo a regra da regex em uma vari�vel
		Matcher matcher = pattern.matcher(texto); // utilizo a regex para dar match no texto
		System.out.println("texto: " + texto);
		System.out.println("�ndice: 0123456789...");
		System.out.println("express�o: " + matcher.pattern()); // express�o que o matcher vai usar pra encontrar
		System.out.println("posi��es encontradas");
		while(matcher.find()) { // descubro quantos matchs foram dados
			System.out.print(matcher.start() + " "); // mostra as posi��es
		}
	}

}
