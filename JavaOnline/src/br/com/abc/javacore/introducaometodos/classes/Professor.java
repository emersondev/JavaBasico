package br.com.abc.javacore.introducaometodos.classes;

public class Professor {
	
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	/**
	 * Pede uma vari�vel de refer�ncia do tipo professor pra ser imprimida
	 * @param prof
	 */
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		System.out.println(this.cpf);
		System.out.println(this.rg);
	}
	
}
