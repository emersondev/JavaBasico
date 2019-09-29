package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando relatorio de pagamento para a gerencia");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Salário: " + gerente.getSalario());
//	}
//	
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando relatorio de pagamento para os vendedores");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Salário: " + vendedor.getSalario());
//	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatorio de pagamento");
		funcionario.calcularPagamento(); // calcular pagamento vai ser de acordo com o tipo do objeto criado e do método do mesmo
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário: " + funcionario.getSalario());
		if(funcionario instanceof Gerente) { // verifica se o objeto recebido em funcionario é uma instancia de gerente
			Gerente g = (Gerente) funcionario;
			System.out.println("Participação dos lucros: " + g.getParticipacaoNosLucros());			
		}
		if(funcionario instanceof Vendedor) { // verifica se o objeto recebido em funcionario é uma instancia de vendedor
			/**
			 * transformo a variável funcionario para vendedor, assim consigo acessar os métodos de vendedor em funcionario 
			 */
			System.out.println("Comissão de vendas: " + ((Vendedor) funcionario).getTotalVendas());
		}
	}
	
}
