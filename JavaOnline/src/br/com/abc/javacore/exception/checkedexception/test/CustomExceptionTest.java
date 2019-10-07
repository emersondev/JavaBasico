package br.com.abc.javacore.exception.checkedexception.test;

import br.com.abc.javacore.exception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			logar();
		} catch(LoginInvalidoException e) {
			e.printStackTrace();
		}

	}
	
	private static void logar() throws LoginInvalidoException {
		String usuarioBancoDeDados = "Jaspion";
		String senhaBancoDeDados = "111";
		String usuarioDigitado = "Jaspion";
		String senhaDigitada = "123";
		
		if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
			throw new LoginInvalidoException();
		} else {
			System.out.println("Logado");			
		}
	}

}
