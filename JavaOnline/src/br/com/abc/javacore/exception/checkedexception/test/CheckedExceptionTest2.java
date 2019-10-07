package br.com.abc.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest2 {

	public static void main(String[] args){
		try {
			criarArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		abrirArquivo();
	}
	
	public static void criarArquivo() throws IOException{
		File file = new File("teste.txt");
		try {
			System.out.println("Arquivo criado? " + file.createNewFile());			
		} catch(IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void abrirArquivo(){
		File file = new File("test2.txt");
		try {
			System.out.println("Abrindo um arquivo");
			System.out.println("Executando a leitura do arquivo");
			throw new Exception();
//			System.out.println("Escrevendo no arquivo");
		} catch(Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		} finally { // bloco finally sempre vai ser executado
			System.out.println("Fechando arquivo");
		}
	}

}
