package br.com.abc.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		DateFormat[] dfa = new DateFormat[6];
		/*
		 * Cada uma das formas v�o apresentar sua pr�pria data de acordo com a linguagem da JVM
		 */
		dfa[0] = DateFormat.getInstance(); // DateFormat � uma classe abstrata, n�o podemos usar o new
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT); 
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM); 
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);  
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat df : dfa) {
			System.out.println(df.format(c.getTime()));
		}
	}

}
