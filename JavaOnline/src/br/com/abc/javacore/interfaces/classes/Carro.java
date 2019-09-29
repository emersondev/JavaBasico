package br.com.abc.javacore.interfaces.classes;

public class Carro implements Tributavel {
	/**
	 * Quando usamos Override não podemos usar um modificador de acesso mais restritivo do que o do método abstrato
	 * private > default > protected > public
	 * exemplo: se o método abstrato é public, só podemos usar public, pois não há outro método menos restritivo que ele
	 */
	@Override
	public void calcularImposto() {
		// TODO Auto-generated method stub
	}
	
}
