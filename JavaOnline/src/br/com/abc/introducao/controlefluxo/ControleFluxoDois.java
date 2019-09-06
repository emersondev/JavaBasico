package br.com.abc.introducao.controlefluxo;

public class ControleFluxoDois {

	public static void main(String[] args) {
		
		byte dia = 8;
		
		// char, int, byte, short, enum, String (esses são os tipos que podem ir no switch)
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terca");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Coloque um dia da semana valido");
			
		}
		
	}
	
}
