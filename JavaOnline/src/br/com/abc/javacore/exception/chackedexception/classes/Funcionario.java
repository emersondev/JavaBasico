package br.com.abc.javacore.exception.chackedexception.classes;

public class Funcionario extends Pessoa {
	/**
	 * não é possível colocar um throws de uma superclasse, somente subclasses e runtimes
	 */
	@Override
	public void salvar() throws RuntimeException {
		
	}

}
