package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares4Test {

	public static void main(String[] args) {
		// \d - todos os d�gito
		// \D - tudo o que n�o for d�gito
		// \s - espa�os em branco ---> s�o considerados espa�os em branco \t \n \r \f
		// \S - caracter que n�o � branco
		// \w - caracteres de palavras a-z, A-Z e digitos e _
		// \W - tudo que n�o for caracter de palavra
		// [] - 
		// *****QUANTIFICADORES*****
		// ? ---- zero ou uma ocorr�ncia
		// * ---- zero ou mais ocorr�ncias
		// + ---- uma ou mais ocorr�ncias
		// [n,m] ---- que vai ser de n at� m ocorr�ncias
		// () ---- agrupar
		// | ---- ou
		// $ ---- fim de linha, encontrar algo que esteja no fim da linha
		// . ---- coringa  1.3 = 123,133,1A3,1 3
		// ^ ---- caracter de nega��o, [^abc] ---- qualquer coisa que n�o tenha a, b ou c
		
//		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//		String texto = "12 0x 0x01FFABC 0x10G 0X1";
//		String regex = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+
//		String texto = "fulano@hotmail.com, 123ciclano@gmail.com, @!#abrao@mail.com.br, teste@gmail.com.br, teste@mail";
//		System.out.println("Email v�lido? " + "@!#abrao@mail.com.br".matches(regex));
		String regex = "\\d[2]/\\d[2]/\\d[2,4]";
		String texto = "05/10/2020 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy
		Pattern pattern = Pattern.compile(regex); // compilo a regra da regex em uma vari�vel
		Matcher matcher = pattern.matcher(texto); // utilizo a regex para dar match no texto
		System.out.println("texto: " + texto);
		System.out.println("�ndice: 0123456789...");
		System.out.println("express�o: " + matcher.pattern()); // express�o que o matcher vai usar pra encontrar
		System.out.println("posi��es encontradas");
		while (matcher.find()) { // descubro quantos matchs foram dados
			System.out.println(matcher.start() + " " + matcher.group()); // mostra as posi��es
		}
	}

}
