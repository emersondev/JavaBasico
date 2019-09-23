package br.com.abc.javacore.blocodeinicializacao.classes;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Cliente {
	// 1 - Alocado espaço na memoria para o objeto que será criado
	// 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explícitos
	// 3 - Bloco de inicialização é executado
	// 4 - O construtor é executado
	
	/* Variaveis */
	private int[] parcelas;
	
	/* Blocos de inicialização devem ser criados antes do construtor pelas boas práticas*/
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o número de parcelas que deseja:");
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
