package br.com.abc.javacore.interfaces.classes;

import br.com.abc.javacore.modificadorfinal.classes.Transportavel;

/**
 * 
 * Diferenças das classes abstratas: 
 * Podemos ter multiplas implementações 
 */
public class Produto implements Tributavel, Transportavel {
	
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;

	public Produto() {
		
	}
	
	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				", Peso: " + peso
				+ ", Preco: " + preco
				+ ", Preco Final: " + precoFinal
				+ ", Valor do Frete: " + valorFrete;
	}
	
	@Override
	public void calcularImposto() {
		precoFinal = this.preco + (this.preco * IMPOSTO);
	}

	@Override
	public void calculaFrete() {
		this.valorFrete = (this.preco / this.peso) * 0.1;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
}
