package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares3Test {

	public static void main(String[] args) {
		// \d - todos os dígito
		// \D - tudo o que não for dígito
		// \s - espaços em branco ---> são considerados espaços em branco \t \n \r \f
		// \S - caracter que não é branco
		// \w - caracteres de palavras a-z, A-Z e digitos e _
		// \W - tudo que não for caracter de palavra
		// [] - 
		// *****QUANTIFICADORES*****
		// ? ---- zero ou uma ocorrência
		// * ---- zero ou mais ocorrências
		// + ---- uma ou mais ocorrências
		// [n,m] ---- que vai ser de n até m ocorrências
		// () ---- agrupar
		// | ---- ou
		// $ ---- fim de linha, encontrar algo que esteja no fim da linha
		
		// regex em números hexadecimais
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // para pegar somente caracteres específicos, temos que colocar colchetes e seta-los, ele somente vai pegar a letra em específico, sem ser uma frase
		String texto = "12 0x 0X 0xFFABC 0x10G 0x1"; // as regex não utilizam o caracter que já deu match
		Pattern pattern = Pattern.compile(regex); // compilo a regra da regex em uma variável
		Matcher matcher = pattern.matcher(texto); // utilizo a regex para dar match no texto
		System.out.println("texto: " + texto);
		System.out.println("índice: 0123456789...");
		System.out.println("expressão: " + matcher.pattern()); // expressão que o matcher vai usar pra encontrar
		System.out.println("posições encontradas");
		while (matcher.find()) { // descubro quantos matchs foram dados
			System.out.println(matcher.start() + " " + matcher.group()); // mostra as posições
		}
	}

}
