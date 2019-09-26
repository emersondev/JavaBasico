package br.com.abc.javacore.enumeracoes.classes;

public enum TipoCliente {
	/* 
	 * as constantes tem que ser as primeiras declaradas
	 * podemos ter vários atributos
	 */
	PESSOA_FISICA(1, "Pessoa Física"),
	// constant specific class body
	PESSOA_JURIDICA(2, "Pessoa Jurídica"){
		// estou sobrescrevendo o método getId para a constante PESSOA_JURIDICA
	};
	
	private int tipo;
	private String nome;
	
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
