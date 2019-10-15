package br.com.abc.javacore.assertions.test;

public class AssertTest {

	public static void main(String[] args) {
		calculaSalario(-1000);

	}
	
	// assert deve ser usado quando for privado segundo as boas regras
	// assert deve ser habilitado no eclipse e tamb�m n�o deve ser usado em produ��o
	private static void calculaSalario(double salario) {
		assert(salario > 0) : "O salario n�o deve ser menor do que zero, sal�rio informado: " + salario;
	}
	
	public static void calcSalario(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}

}
