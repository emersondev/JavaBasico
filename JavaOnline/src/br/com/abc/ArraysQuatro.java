package br.com.abc;

public class ArraysQuatro {

	public static void main(String[] args) {
		
		int[][] dias = new int[2][2]; // no array multidemensional, a posição do primeiro colchete é uma referência para o segundo colchete, onde de fato vai ter o valor
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 29;
		dias[1][1] = 28;
		
//		for(int i = 0; i < dias.length; i++) {
//			
//			for(int x = 0; x < dias[i].length; x++) {
//				System.out.println(dias[i][x]);
//			}
//			
//		}
		
		for(int[] ref: dias) {
			
			for(int dia: ref) {
				
				System.out.println(dia);
				
			}
			
		}
		
	}

}
