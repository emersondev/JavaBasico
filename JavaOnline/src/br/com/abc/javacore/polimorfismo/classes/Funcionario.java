package br.com.abc.javacore.polimorfismo.classes;

public abstract class Funcionario {

	protected String nome;
	protected double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Salario: " + salario;
	}
	
	public abstract void calcularPagamento();
}
