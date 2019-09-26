package br.com.abc.javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {
	
	private double totalVendas;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}

	@Override
	public void calculaSalario() {
		setSalario(getSalario() + (totalVendas * 0.05));
	}

	public double getTotalVendas() {
		return this.totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

}
