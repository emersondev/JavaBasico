package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares4Test {

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
		// . ---- coringa  1.3 = 123,133,1A3,1 3
		// ^ ---- caracter de negação, [^abc] ---- qualquer coisa que não tenha a, b ou c
		
//		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//		String texto = "12 0x 0x01FFABC 0x10G 0X1";
//		String regex = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+
//		String texto = "fulano@hotmail.com, 123ciclano@gmail.com, @!#abrao@mail.com.br, teste@gmail.com.br, teste@mail";
//		System.out.println("Email válido? " + "@!#abrao@mail.com.br".matches(regex));
		String regex = "\\d[2]/\\d[2]/\\d[2,4]";
		String texto = "05/10/2020 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy
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
