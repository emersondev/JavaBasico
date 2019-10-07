package br.com.abc.javacore.exception.checkedexception.test;

import java.io.IOException;
import br.com.abc.javacore.exception.chackedexception.classes.Funcionario;
import br.com.abc.javacore.exception.chackedexception.classes.Pessoa;
import br.com.abc.javacore.exception.customexceptions.LoginInvalidoException;

public class SobrescritaComExceptionsTest {
	public static void main(String[] args) throws LoginInvalidoException, IOException {
		Funcionario f = new Funcionario();
		Pessoa p = new Pessoa();
		
		p.salvar();
	}
}
