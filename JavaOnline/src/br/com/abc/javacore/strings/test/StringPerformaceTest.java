package br.com.abc.javacore.strings.test;

public class StringPerformaceTest {
	
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		concatString(90000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto String : " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(1000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder : " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(1000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer : " + (fim - inicio) + "ms");
		
	}
	
	private static void concatString(int tamanho) {
		String string = "";
		for(int i = 0; i < tamanho; i++) {
			string += 1;
		}
	}
	
	/**
	 * StringBuilder � mais r�pido na teoria
	 */
	private static void concatStringBuilder(int tamanho) {
		StringBuilder str = new StringBuilder(tamanho);
		for(int i = 0; i < tamanho; i++) {
			str.append(i);
		}
	}
	
	/**
	 * StringBuilder e StringBuffer s�o exatamente iguais, a �nica diferen�a � que o String buffer � protegido contra
	 * acesso de multiplas threads
	 */
	private static void concatStringBuffer(int tamanho) {
		StringBuffer str = new StringBuffer(tamanho);
		for(int i = 0; i < tamanho; i++) {
			str.append(i);
		}
	}
}
 