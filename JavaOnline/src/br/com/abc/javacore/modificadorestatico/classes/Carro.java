package br.com.abc.javacore.modificadorestatico.classes;

public class Carro {

	/* Variáveis */
	// Velocidade limite deve ser de 240 km/h
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	/*Construtores*/
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Carro() {
	}

	/* Getters and Setters */
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static double getVelocidadeLimite() {
		return Carro.velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	/*Métodos*/
	
	
	public void imprime() {
		System.out.println("------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade limite: " + this.velocidadeLimite);
	}
}
