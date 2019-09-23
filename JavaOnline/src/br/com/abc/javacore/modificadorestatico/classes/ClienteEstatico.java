package br.com.abc.javacore.modificadorestatico.classes;

import java.util.Scanner;

public class ClienteEstatico {
		
		/* Variaveis */
		private static int[] parcelas;
		
		/* Blocos de inicializa��o estatico vai ser executando antes de tudo e apenas uma vez 
		 * (pode haver mais de um bloco inicializa��o)*/
		static {
			System.out.println("bloco de inicializa��o statico\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Coloque o n�mero de parcelas que deseja:");
			parcelas = new int[sc.nextInt()];
			for(int x = 1; x <= parcelas.length; x++) {
				System.out.println("Parcela: " + (parcelas[x-1] = x));
			}
		}
		
		{
			System.out.println("bloco de inicializa��o n�o est�tico");
		}
		
		/* Construtor */
		public ClienteEstatico() {
		}
		
		/* Getters and Setters*/
		public static int[] getParcelas() {
			return ClienteEstatico.parcelas;
		}		
}
