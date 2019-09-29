package br.com.abc.javacore.classesabstratas.classes;

public abstract class Pessoa {
	
	protected String nome;
	
	/**
	 * M�todos abstratos s�o obrigat�rios a serem implementados nas classes concretas (n�o abstratas) 
	 */
	public abstract void print();
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
