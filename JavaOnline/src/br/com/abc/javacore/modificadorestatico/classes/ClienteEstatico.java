package br.com.abc.javacore.modificadorestatico.classes;

import java.util.Scanner;

public class ClienteEstatico {
		
		/* Variaveis */
		private static int[] parcelas;
		
		/* Blocos de inicialização estatico vai ser executando antes de tudo e apenas uma vez 
		 * (pode haver mais de um bloco inicialização)*/
		static {
			System.out.println("bloco de inicialização statico\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Coloque o número de parcelas que deseja:");
			parcelas = new int[sc.nextInt()];
			for(int x = 1; x <= parcelas.length; x++) {
				System.out.println("Parcela: " + (parcelas[x-1] = x));
			}
		}
		
		{
			System.out.println("bloco de inicialização não estático");
		}
		
		/* Construtor */
		public ClienteEstatico() {
		}
		
		/* Getters and Setters*/
		public static int[] getParcelas() {
			return ClienteEstatico.parcelas;
		}		
}
