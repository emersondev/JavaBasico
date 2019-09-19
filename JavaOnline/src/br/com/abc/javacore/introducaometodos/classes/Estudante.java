package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
	
	private String nome;
	private int idade;
	private float media = 0f;
	private boolean aprovado = false;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Coloque uma idade válida");
			return;	
		}
		this.idade = idade;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public float getMedia() {
		return this.media;
	}
	public boolean isAprovado() {
		return this.aprovado;
	}
	/**
	 * Adicione as notas ao parâmetro separadas por vírgula, ou passe um array do tipo float com as notas do aluno
	 * @param notas
	 */
	public void calcularMedia(float... notas) {
			
			float notaTotal = 0;
			
			for(float i: notas) {
				notaTotal += i;
			}
			
			this.media = notaTotal / notas.length;
		}
		
	
	/**
	 * apresenta os dados do aluno no console
	 */
	public void imprimeDados() {
		
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Idade: " + (byte)this.idade);
		if(this.media < 6) {
			System.out.println("Situação do aluno: " + aprovado + "\nmédia do aluno: " + this.media);
			return;
		}
		aprovado = true;
		System.out.println("Situação do aluno: " + aprovado + "\nmédia do aluno: " + this.media);
	}
	
}
