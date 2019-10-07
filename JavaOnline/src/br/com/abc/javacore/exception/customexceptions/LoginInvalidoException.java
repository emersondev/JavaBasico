package br.com.abc.javacore.exception.customexceptions;

public class LoginInvalidoException extends Exception {
	
	/**
	 * não fazer tratamentos em classes de exceções
	 */
	public LoginInvalidoException() {
		super("Usuário ou senha inválidos");
	}

}
