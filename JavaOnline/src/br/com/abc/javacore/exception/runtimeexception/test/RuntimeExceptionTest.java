package br.com.abc.javacore.exception.runtimeexception.test;

/**
 * Quando você tem Runtime Exception não precisa colocar try catch, existem outras maneiras de trabalhar com esse problema
 */

public class RuntimeExceptionTest {

	public static void main(String[] args) {
//		Object o = null;
//		int a = 10;
//		int b = 0;
//		int c = a / b;
//		if(a != 0 && b != 0) {
//			System.out.println(c);			
//		}
//		System.out.println(c); // exception, não tem como dividir por zero // em tempo de compilação
//		System.out.println(o.toString()); // null pointer exception, não tem objeto pra chamar o método do mesmo
		try {
			int[] arr = new int[2]; // posição 0 e posição 1 
			System.out.println(arr[2]); // acessando posição não existente
			System.out.println("tentando imprimir depois do erro");			
		} catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("Erro apresentado");
		}
		System.out.println("Fora do bloco catch"); // A JVM deixa continua a executar o código
	}

}
