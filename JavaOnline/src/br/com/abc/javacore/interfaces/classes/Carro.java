package br.com.abc.javacore.interfaces.classes;

public class Carro implements Tributavel {
	/**
	 * Quando usamos Override n�o podemos usar um modificador de acesso mais restritivo do que o do m�todo abstrato
	 * private > default > protected > public
	 * exemplo: se o m�todo abstrato � public, s� podemos usar public, pois n�o h� outro m�todo menos restritivo que ele
	 */
	@Override
	public void calcularImposto() {
		// TODO Auto-generated method stub
	}
	
}
