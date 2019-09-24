package br.com.abc.javacore.associacao.classes;

public class Local {
	
	private String rua;
	private String bairro;
	
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public Local() {
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void print() {
		System.out.println("************************************Relatório do Local************************************");
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}
	
}
