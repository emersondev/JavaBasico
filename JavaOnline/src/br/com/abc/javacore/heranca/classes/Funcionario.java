package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {

	private double salario;

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void print() {
		System.out.println("Salário: " + this.salario);
	}
	
}
