package br.com.abc.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		/*
		 *  os par�metros desse objeto s�o baseados de acordo com a ISO 639 ex:
		 *  pt - portugues, BR = Brazil
		 *  en - ingl�s, US - Estados Unidos da Am�rica
		 *  
		 *  resumindo o c�digo, locale passa o pa�s, calendar pega a data desejada, e o DateFormat formata para uma forma mais amig�vel
		 */
		Locale locItaly = new Locale("it", "IT"); // setando pa�s e a l�ngua
		Locale locSwitzerland = new Locale("it", "CH"); // setando pa�s e a l�ngua
		Locale locIndia = new Locale("hi", "IN"); // setando pa�s e a l�ngua
		Locale locJapan = new Locale("ja"); // setando pa�s e a l�ngua
		
		Calendar c = Calendar.getInstance(); // criando uma inst�ncia de Calendar
		c.set(2020, Calendar.DECEMBER, 05); // setando na inst�ncia de calendar uma data
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locItaly); // fazendo uma inst�ncia de DateFormat como par�metro o formato FULL e o Locale ( no caso pa�s: It�lia, l�ngua: Italiano )
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSwitzerland); // fazendo uma inst�ncia de DateFormat como par�metro o formato FULL e o Locale ( no caso pa�s: Su��a, l�ngua: Italiano )
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia); // fazendo uma inst�ncia de DateFormat como par�metro o formato FULL e o Locale ( no caso pa�s: �ndia, l�ngua: hindu )
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapan); // fazendo uma inst�ncia de DateFormat como par�metro o formato FULL e o Locale ( no caso pa�s: Jap�o, l�ngua: Japon�s )
		
		
		System.out.println("It�lia: " + df1.format(c.getTime())); // formatando o DateFormat com o date (no caso usando getTime do calendar que retorna um date)
		System.out.println("Su��a: " + df2.format(c.getTime()));
		System.out.println("�ndia: " + df3.format(c.getTime()));
		System.out.println("Jap�o: " + df4.format(c.getTime()));
		
		System.out.println(locJapan.getDisplayLanguage(locItaly)); // pega o nome da lingua local, quando passo o locale no par�metro, ele mostra a l�ngua do pa�s da data, falada no pa�s passado pelo locale
		System.out.println(locSwitzerland.getDisplayCountry(locItaly)); // pega o nome do pa�s local, quando passo o locale no par�metro, ele mostra o nome do pa�s da data, falada no pa�s passado pelo locale
		System.out.println(locIndia.getDisplayLanguage(locIndia));
	}

}
