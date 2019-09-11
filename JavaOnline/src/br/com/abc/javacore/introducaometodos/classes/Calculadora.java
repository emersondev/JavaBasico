package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
	
	public void somaDoisNumeros() {
		System.out.println(5+5);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(5-5);
	}
	
	public void multiplicaDoisNumeros(double numero1, double numero2) {
		System.out.println(numero1 * numero2);
	}
	
	public double divideDoisNumeros(double numero1, double numero2) {
		if(numero1 != 0 && numero2 != 0) {
			return numero1/numero2;
		}
		return 0;
	}
	
	public void imprimeDivideDoisNumeros(double numero1, double numero2) {
		if(numero1 != 0 && numero2 != 0) {
			System.out.println(numero1/numero2);
			return; // return seguido de ponto e vírgula funciona como um break no switch
		}
		System.out.println("Não é possível dividir por 0");
	}
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do altera:");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
	}
	
	
	// VarArgs você pode passar o array ou passar o parâmetro diretamente e quantos números quiser
	/**
	 * VarArgs regras:
	 * Apenas um VarArgs por assinatura
	 * Ele sempre vai ser o último se tiver mais variáveis
	 */
	public void somaVarArgs(int... numeros) {
		
		int soma = 0;
		
		for(int num : numeros) {
			soma += num;
		}
		
		System.out.println(soma);
		
	}
	
}
