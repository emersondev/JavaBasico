package br.com.abc.javacore.exception.error.test;

/**
 * 
 * método fica se chamando até sobrecarregar a memória, dando um erro de stack
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
