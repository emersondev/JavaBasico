package br.com.abc.javacore.datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		float valor = 123.1234f;
		Locale locCH = new Locale("zh", "CN"); // China
		NumberFormat[] nfa = new NumberFormat[4]; // lembrando, não estamos instanciando, mas somente criando um array de NumberFormat
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locCH);
		nfa[2] = NumberFormat.getCurrencyInstance(); // mostra a moeda local de acordo com a JVM
		nfa[3] = NumberFormat.getCurrencyInstance(locCH); // mostra a moeda de acordo com o locale
		for(NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits()); // visualiza o nº de dígitos nas casas decimais
		nf.setMaximumFractionDigits(5); // seta o nº de dígitos nas casas decimais
		System.out.println(nf.format(valor));
		String valorString = "232.3123";
		try {
			System.out.println(nf.parse(valorString));
			nf.setParseIntegerOnly(true); // só pega os inteiros da valorString
			System.out.println(nf.parseObject(valorString)); // mostrando somente os inteiros
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
