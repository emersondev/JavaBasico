package br.com.abc.javacore.exception.customexceptions;

public class LoginInvalidoException extends Exception {
	
	/**
	 * n�o fazer tratamentos em classes de exce��es
	 */
	public LoginInvalidoException() {
		super("Usu�rio ou senha inv�lidos");
	}

}
