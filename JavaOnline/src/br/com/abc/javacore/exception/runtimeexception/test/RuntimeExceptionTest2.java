package br.com.abc.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		try {
			divisao(0,0);
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void divisao(double num1, double num2) {
		if(num1 == 0 && num2 == 0 ) {
			throw new IllegalArgumentException("Passe um valor diferente de zero");
		}
		double resultado = num1 / num2;
		System.out.println(resultado);
	}
}
