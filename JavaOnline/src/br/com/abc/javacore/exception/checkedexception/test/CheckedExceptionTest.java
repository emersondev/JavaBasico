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
			System.out.println("Arquivo criado? " + file.createNewFile()); // como não definimos caminho, ele cria dentro do próprio projeto
			// para usar as classes de exceções como IOException e Exception, obrigatóriamente tenho que ter um código que possa dar problema
		}catch(IOException e) { 
			e.printStackTrace(); // esse método me mostra todo o erro acontecido, ele é um void, e não pode ser colocado em um System.out.println pois ele não tem retorno
		}
	}

}
