package br.com.abc.javacore.datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// tudo o que estiver entre ap�strofos, a JVM n�o tenta converter
		// usar a documenta��o do SimpleDateFormat pra 
		String mascara = "'Atlanta', dd 'de' MMMM 'de' yyyy G";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		System.out.println(formatador.format(c.getTime()));
	}

}
