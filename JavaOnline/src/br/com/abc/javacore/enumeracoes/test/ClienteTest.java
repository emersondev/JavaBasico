package br.com.abc.javacore.enumeracoes.test;

import br.com.abc.javacore.enumeracoes.classes.Cliente;
import br.com.abc.javacore.enumeracoes.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
		System.out.println(cliente);

	}

}
