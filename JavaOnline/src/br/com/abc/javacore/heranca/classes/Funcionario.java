package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {

	private double salario;
	
	public Funcionario(String nome) {
		super(nome); // super segue a mesma do this, ele tem que ser a primeira linha e não pode ter this junto
		
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimeReciboPagamento() {
		System.out.println("Eu " + super.nome + " recebi pagamento de R$" + this.salario);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Salário: " + this.salario);
		imprimeReciboPagamento();
	}
	
}
