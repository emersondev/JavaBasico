package br.com.abc;
public class ArraysTres {
	
	public static void main(String[] args) {
		
		// formas de inicializar array
		int[] numeros = new int[5]; 
		int[] numeros2 = {1, 2, 3, 4, 5};
		int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // aqui não pode definir o valor na hora de instanciar, pois a chaves já seta isso
		
//		for(int i = 0; i < numeros2.length; i++) {
//			System.out.println(numeros2[i]);
//		}
		
		for(int i : numeros2) { // a variável "i" representa cada uma das posições do meu array numeros2
			System.out.println(i);
		} 
		
	}
	
}