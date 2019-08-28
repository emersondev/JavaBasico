/*
 * Crie uma variável salario e imprima seu imposto de acordo com a tabela
 * abaixo:
 * salario < 1000 ------ 5%
 * salario >= 1000 && salario < 2000 ------- 10%
 * salario >= 2000 && salario < 4000 ------- 15%
 * salario >= 5000 ------- 20%
 */

public class ExercicioControleFluxo {

	public static void main(String[] args) {
		int salario = -1;
		double imposto;
		if(salario > 1 && salario < 1000) {
			imposto = (salario * 0.05);
			System.out.println("O salario é: " + salario + " e o imposto é: " + imposto);
		} else if(salario >= 1000 && salario < 2000) {
			imposto = (salario * 0.10);
			System.out.println("O salario é: " + salario + " e o imposto é: " + imposto);
		} else if(salario >= 2000 && salario < 4000) {
			imposto = (salario * 0.15);
			System.out.println("O salario é: " + salario + " e o imposto é: " + imposto);
		} else if(salario >= 5000){
			imposto = (salario * 0.20);
			System.out.println("O salario é: " + salario + " e o imposto é: " + imposto);
		} else {
			imposto = 0;
			System.out.println("coloque um valor de salário positivo");
		}		
		
	}

}
