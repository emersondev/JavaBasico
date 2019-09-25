package br.com.abc.javacore.sobrescrita.classes;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Sobrescrevi o método toString que retorna o endereço de memória do objeto instanciado da classe pessoa
	 * assim forçando o método a retornar nome e idade em formato de String
	 * 
	 * OBS: não posso colocar um modificador de acesso mais privado do que na classe pai (Object no caso)
	 * ex: private String toString() --------------- iria dar um erro de compilação
	 * 
	 */
	@Override
	public String toString() {
		return ("Nome: " + nome + ", idade: " + idade);
	}

}
