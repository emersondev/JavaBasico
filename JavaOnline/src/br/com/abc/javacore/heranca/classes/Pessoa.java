package br.com.abc.javacore.heranca.classes;

public class Pessoa {

	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa(String nome) {
		this.nome = nome; // construtor da própria classe ***
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome); // chama o construtor da própria classe ***
		this.cpf = cpf;
	}
	
	public Pessoa() {
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco.getLogradouro() + ", Bairro: " + this.endereco.getBairro());
	}
}
