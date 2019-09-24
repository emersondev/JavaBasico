package br.com.abc.javacore.associacao.classes;

public class Professor {
	
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	public void print() {
		System.out.println("************************************Relatório do Professor************************************");
		System.out.println("Nome do professor(a): " + this.nome);
		System.out.println("Nome do professor(a): " + this.especialidade);
		if(seminarios != null && seminarios.length != 0) {
			System.out.println("Seminários participantes:");
			for(Seminario sem : seminarios) {
				System.out.println("* " + sem.getTitulo());
			}
			return;
		}
		System.out.println("Professor(a) não vinculado a nenhum seminário");
	}
	
}
