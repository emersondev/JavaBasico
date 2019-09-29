package br.com.abc.javacore.classesabstratas.classes;

public abstract class Pessoa {
	
	protected String nome;
	
	/**
	 * Métodos abstratos são obrigatórios a serem implementados nas classes concretas (não abstratas) 
	 */
	public abstract void print();
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
