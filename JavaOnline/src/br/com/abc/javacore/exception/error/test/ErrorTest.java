package br.com.abc.javacore.exception.error.test;

/**
 * 
 * m�todo fica se chamando at� sobrecarregar a mem�ria, dando um erro de stack
 *
 */

public class ErrorTest {

	public static void main(String[] args) {
		stackOverflowError();
	}

	public static void stackOverflowError() {
		stackOverflowError();
	}

}
