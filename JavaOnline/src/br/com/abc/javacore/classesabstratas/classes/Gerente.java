package br.com.abc.javacore.classesabstratas.classes;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
	}
	
	@Override
	public void calculaSalario() {
		setSalario(getSalario() + (getSalario() * 0.2));
	}
}
