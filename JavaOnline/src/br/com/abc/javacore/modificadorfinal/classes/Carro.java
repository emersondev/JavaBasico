package br.com.abc.javacore.modificadorfinal.classes;

/**
 * Classes final n�o podem ser extendidas
 */

public final class Carro {
	public static final double VELOCIDADE_FINAL = 220; // constante � declarada em UPPER CASE
	private final Comprador COMPRADOR = new Comprador();
	private String nome;
	private String marca;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Comprador getComprador() {
		return COMPRADOR;
	}

	@Override
	public String toString() {
		return "Carro{" +
				"Nome='" + nome + '\'' +
				", marca='" + marca + '\'' +
				'}';
	}
	
	/**
	 * Esses m�todos final n�o pode ser sobrescritos, mas pode fazer sobrecarga
	 */
	public final void imprime() {
		
	}
}
