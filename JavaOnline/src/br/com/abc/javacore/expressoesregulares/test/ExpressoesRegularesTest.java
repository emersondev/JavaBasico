package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		String regex = "aba";
		String texto = "abababa"; // as regex não utilizam o caracter que já deu match
		Pattern pattern = Pattern.compile(regex); // compilo a regra da regex em uma variável
		Matcher matcher = pattern.matcher(texto); // utilizo a regex para dar match no texto
		System.out.println("texto: " + texto);
		System.out.println("índice: 0123456789");
		System.out.println("expressão: " + matcher.pattern()); // expressão que o matcher vai usar pra encontrar
		System.out.println("posições encontradas");
		while(matcher.find()) { // descubro quantos matchs foram dados
			System.out.print(matcher.start() + " "); // mostra as posições
		}
	}

}
