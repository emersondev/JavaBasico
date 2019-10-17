package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares3Test {

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
		
		// regex em n�meros hexadecimais
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // para pegar somente caracteres espec�ficos, temos que colocar colchetes e seta-los, ele somente vai pegar a letra em espec�fico, sem ser uma frase
		String texto = "12 0x 0X 0xFFABC 0x10G 0x1"; // as regex n�o utilizam o caracter que j� deu match
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
