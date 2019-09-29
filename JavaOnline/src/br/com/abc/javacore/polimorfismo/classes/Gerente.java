package br.com.abc.javacore.polimorfismo.classes;

public class Gerente extends Funcionario {

	private double pnl;

	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.pnl = pnl;
	}

	public double getParticipacaoNosLucros() {
		return this.pnl;
	}

	public void setParticipacaoNosLucros(double participacaoNosLucros) {
		this.pnl = participacaoNosLucros;
	}
	
	@Override
	public void calcularPagamento() {
		this.salario = this.salario + this.pnl;
		
	}

}
