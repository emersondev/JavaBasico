package br.com.abc.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		/*
		 *  os parâmetros desse objeto são baseados de acordo com a ISO 639 ex:
		 *  pt - portugues, BR = Brazil
		 *  en - inglês, US - Estados Unidos da América
		 *  
		 *  resumindo o código, locale passa o país, calendar pega a data desejada, e o DateFormat formata para uma forma mais amigável
		 */
		Locale locItaly = new Locale("it", "IT"); // setando país e a língua
		Locale locSwitzerland = new Locale("it", "CH"); // setando país e a língua
		Locale locIndia = new Locale("hi", "IN"); // setando país e a língua
		Locale locJapan = new Locale("ja"); // setando país e a língua
		
		Calendar c = Calendar.getInstance(); // criando uma instância de Calendar
		c.set(2020, Calendar.DECEMBER, 05); // setando na instância de calendar uma data
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locItaly); // fazendo uma instância de DateFormat como parâmetro o formato FULL e o Locale ( no caso país: Itália, língua: Italiano )
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSwitzerland); // fazendo uma instância de DateFormat como parâmetro o formato FULL e o Locale ( no caso país: Suíça, língua: Italiano )
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia); // fazendo uma instância de DateFormat como parâmetro o formato FULL e o Locale ( no caso país: Índia, língua: hindu )
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapan); // fazendo uma instância de DateFormat como parâmetro o formato FULL e o Locale ( no caso país: Japão, língua: Japonês )
		
		
		System.out.println("Itália: " + df1.format(c.getTime())); // formatando o DateFormat com o date (no caso usando getTime do calendar que retorna um date)
		System.out.println("Suíça: " + df2.format(c.getTime()));
		System.out.println("Índia: " + df3.format(c.getTime()));
		System.out.println("Japão: " + df4.format(c.getTime()));
		
		System.out.println(locJapan.getDisplayLanguage(locItaly)); // pega o nome da lingua local, quando passo o locale no parâmetro, ele mostra a língua do país da data, falada no país passado pelo locale
		System.out.println(locSwitzerland.getDisplayCountry(locItaly)); // pega o nome do país local, quando passo o locale no parâmetro, ele mostra o nome do país da data, falada no país passado pelo locale
		System.out.println(locIndia.getDisplayLanguage(locIndia));
	}

}
