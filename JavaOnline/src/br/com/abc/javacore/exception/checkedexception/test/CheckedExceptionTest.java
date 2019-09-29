package br.com.abc.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;
/**
 * Sou obrigado a a colocar try catch em CheckedExceptions
 */
public class CheckedExceptionTest {

	public static void main(String[] args) {
		criarArquivo();
	}
	
	public static void criarArquivo() {
		File file = new File("teste.txt");
		try {
			System.out.println("Arquivo criado? " + file.createNewFile()); // como n�o definimos caminho, ele cria dentro do pr�prio projeto
			// para usar as classes de exce��es como IOException e Exception, obrigat�riamente tenho que ter um c�digo que possa dar problema
		}catch(IOException e) { 
			e.printStackTrace(); // esse m�todo me mostra todo o erro acontecido, ele � um void, e n�o pode ser colocado em um System.out.println pois ele n�o tem retorno
		}
	}

}
