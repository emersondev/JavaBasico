package br.com.abc.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
	
	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		}catch(IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		}catch(ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		}catch(RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
		System.out.println("final do programa");
		
		try {
			talvezLanceException();
		}catch(SQLException e) {
			
		}catch(IOException e) {
			
		}
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException {
		
	}
}
