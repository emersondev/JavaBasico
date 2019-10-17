package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		String regex = "aba";
		String texto = "abababa"; // as regex n�o utilizam o caracter que j� deu match
		Pattern pattern = Pattern.compile(regex); // compilo a regra da regex em uma vari�vel
		Matcher matcher = pattern.matcher(texto); // utilizo a regex para dar match no texto
		System.out.println("texto: " + texto);
		System.out.println("�ndice: 0123456789");
		System.out.println("express�o: " + matcher.pattern()); // express�o que o matcher vai usar pra encontrar
		System.out.println("posi��es encontradas");
		while(matcher.find()) { // descubro quantos matchs foram dados
			System.out.print(matcher.start() + " "); // mostra as posi��es
		}
	}

}
