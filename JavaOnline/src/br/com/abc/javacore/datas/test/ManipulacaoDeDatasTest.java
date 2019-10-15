package br.com.abc.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {

		Date date = new Date(); // aqui passo a data em milisegundos, caso n�o passe, pega a data atual
		System.out.println(date); // getTime pega o valor atual em milisegundos
		
		Calendar c = Calendar.getInstance(); // Calendar � uma classe abstrata, ent�o o m�todo getInstace d� uma inst�ncia da msm
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("� domingo!");
		}
		
		System.out.println("Dia do m�s: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
		c.add(Calendar.HOUR, 12); // adicionei 12 horas ao calend�rio
		c.roll(Calendar.MONTH, 9); // adiciona 9 meses mas n�o vira o ano com o roll
		Date date2 = c.getTime();
		System.out.println("Date2: " + date2);
	}

}
