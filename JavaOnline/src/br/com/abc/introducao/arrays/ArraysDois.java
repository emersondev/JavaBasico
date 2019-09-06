package br.com.abc.introducao.arrays;
public class ArraysDois {

	public static void main(String[] args) {
		/** Com quais valores padr�es iniciam os arrays?
		* para o tipo byte, short, int, long, float, double ------- 0
		* para o tipo char ------- '\u0000' ou ' ' ------- espa�o
		* para o tipo reference ------- null
		* para o tipo boolean ------- false
		*/
		String[] nomes = new String[4];
		nomes[0] = "Kurosaki";
		nomes[1] = "Monkey";
		nomes[2] = "Son";
		nomes[3] = "Uzumaki";
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		nomes = new String[5]; // atribu� uma nova refer�ncia a vari�vel nomes e a refer�ncia antiga foi perdida
	}
	
}