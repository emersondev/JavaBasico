package br.com.abc.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {

	private String nome;
	private String clt;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	public abstract void calculaSalario();
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClt() {
		return this.clt;
	}

	public void setClt(String clt) {
		this.clt = clt;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CLT: " + clt + ", Salario: " + salario;
	}

}
