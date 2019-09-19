package br.com.abc.javacore.sobrecargametodos.classes;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String rg;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String rg, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void init(String nome, String cpf, String rg, double salario) {
		init(nome, cpf, salario);
		this.rg = rg;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.rg);
		System.out.println(this.salario);
	}
	
}
