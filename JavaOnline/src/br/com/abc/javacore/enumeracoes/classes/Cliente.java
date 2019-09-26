package br.com.abc.javacore.enumeracoes.classes;

public class Cliente {
	
	public enum TipoPagamento {
		AVISTA,
		APRAZO
	}

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoPagamento getTipoPagamento() {
		return this.tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Nome: " +
				nome + ", tipo do cliente: " +
				tipoCliente.getNome() +
				", Tipo do pagamento: " +
				tipoPagamento + ", numero: "
				+ tipoCliente.getTipo();
	}
	
}
