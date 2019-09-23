package br.com.abc.javacore.blocodeinicializacao.classes;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Cliente {
	// 1 - Alocado espa�o na memoria para o objeto que ser� criado
	// 2 - Cada atributo de classe � criado e inicializado com seus valores default ou valores expl�citos
	// 3 - Bloco de inicializa��o � executado
	// 4 - O construtor � executado
	
	/* Variaveis */
	private int[] parcelas;
	
	/* Blocos de inicializa��o devem ser criados antes do construtor pelas boas pr�ticas*/
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o n�mero de parcelas que deseja:");
		parcelas = new int[sc.nextInt()];
		for(int x = 1; x <= parcelas.length; x++) {
			System.out.println("Parcela: " + (parcelas[x-1] = x));
		}
	}
	
	/* Construtor */
	public Cliente() {
	}
	
	/* Getters and Setters*/
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
}
