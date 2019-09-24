package br.com.abc.javacore.associacao.classes;

public class Seminario {
	
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return this.local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public void print() {
		System.out.println("************************************Relatório do Seminário************************************");
		System.out.println("Título: " + this.titulo);
		if(this.professor != null) {
			System.out.println("Professor palestrante: " + this.professor.getNome());			
		} else {
			System.out.println("Nenhum professor cadastrado para esse seminário");
		}
		if(this.local != null) {
			System.out.println("logradouro: " + local.getRua() + " bairro " + this.local.getBairro());
		} else {
			System.out.println("Nenhum local cadastrado para esse seminário");
		}
		System.out.println("Alunos participantes");
		if(alunos != null && alunos.length != 0) {
			for(Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
			}
			return;
		}
		System.out.println("Nenhum aluno cadastrado");
	}
	
}
