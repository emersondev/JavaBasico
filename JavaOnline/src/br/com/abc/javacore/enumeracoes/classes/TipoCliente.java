package br.com.abc.javacore.enumeracoes.classes;

public enum TipoCliente {
	/* 
	 * as constantes tem que ser as primeiras declaradas
	 * podemos ter v�rios atributos
	 */
	PESSOA_FISICA(1, "Pessoa F�sica"),
	// constant specific class body
	PESSOA_JURIDICA(2, "Pessoa Jur�dica"){
		// estou sobrescrevendo o m�todo getId para a constante PESSOA_JURIDICA
	};
	
	private int tipo;
	private String nome;
	
	/**
	 * Construtores de enumera��es, eles mesmos v�o se chamar, ent�o n�o pode ser publico por isso (ele j� � considerado private)
	 * 
	 */
	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	 
	public String getId() {
		return "A";
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
}
