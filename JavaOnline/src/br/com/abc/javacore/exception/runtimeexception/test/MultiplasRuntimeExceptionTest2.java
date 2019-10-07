package br.com.abc.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest2 {
	
	public static void main(String[] args) {
		/**
		 * No java 7 podemos separar as exceções por pipe 
		 */
		try {
			talvezLanceException();
			// não podemos colocar classes da mesma linha de herança
		}catch(SQLException | IOException e) {
			// e = new SQLException(); // a partir do java 7 não pode instanciar um objeto de uma exception específica, devido ao fato de que pode ser uma ou outra 
		}
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException {
		
	}
}
