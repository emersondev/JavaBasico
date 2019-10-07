package br.com.abc.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest2 {
	
	public static void main(String[] args) {
		/**
		 * No java 7 podemos separar as exce��es por pipe 
		 */
		try {
			talvezLanceException();
			// n�o podemos colocar classes da mesma linha de heran�a
		}catch(SQLException | IOException e) {
			// e = new SQLException(); // a partir do java 7 n�o pode instanciar um objeto de uma exception espec�fica, devido ao fato de que pode ser uma ou outra 
		}
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException {
		
	}
}
