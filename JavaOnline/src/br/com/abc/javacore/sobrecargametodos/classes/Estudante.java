package br.com.abc.javacore.sobrecargametodos.classes;

public class Estudante {
	
	/* Variáveis */
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	/* Construtores */
	public Estudante(String matricula, String nome, double... notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		// chamar construtor pelo this tem 2 regras, a primeira regra que ele dever estar na primeira linha
		// a segunda regra é que ele deve estar dentro de outro construtor
		this(matricula, nome, notas); // ele chama o construtor acima, devido a ordem das variáveis
		this.dataMatricula = dataMatricula;
	}

	public Estudante() {

	}
	
	/* Getters and Setters */
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	/* Métodos */
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		for(double nota : notas) {
			System.out.print(nota + " ");
		}
	}

}
