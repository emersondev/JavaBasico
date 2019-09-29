package br.com.abc.javacore.interfaces.classes;

/**
 * Todos os métodos são considerados public static
 * Todos os atributos de uma interface são considerados uma constante, implicitamente eles vem com public static final
 *
 */

public interface Tributavel {
	
	double IMPOSTO = 0.2;
	
	void calcularImposto();
	
}
