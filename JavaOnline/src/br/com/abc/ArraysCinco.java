package br.com.abc;

public class ArraysCinco {

	public static void main(String[] args) {
		
		int[][] dias = {{2,1,4},{5,6,3},{7,0,8}};
		
		for(int[] arr : dias) {
			for(int dia : arr) {
				System.out.println(dia);
			}
		}
	}

}
