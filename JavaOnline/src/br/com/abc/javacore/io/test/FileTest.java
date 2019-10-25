package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		// at� os 4 minutos
		
		// estamos instanciando a file com o caminho onde vai ser criado o Arquivo, � necess�rio escapar a barra
		File file = new File("c:\\Users\\enovais\\Desktop\\Arquivo_de_Criacao.txt");
		// usar o file, devemos colocar um tratamento de exce��o
		// m�todo que executa a cria��o
		try {
			System.out.println("Arquivo foi criado? " + file.createNewFile());
			boolean exists = file.exists();
			System.out.println("Arquivo existe? " + exists);
			System.out.println("Permiss�o de leitura? "+ file.canRead());
			System.out.println("Onde o arquivo est�? (Path do Arquivo): " + file.getPath());
			System.out.println("Caminho absoluto do arquivo? " + file.getAbsolutePath());
			System.out.println("� um diret�rio? " + file.isDirectory());
			System.out.println("�ltima modifica��o? " + new Date(file.lastModified()));
			System.out.println("� um arquivo oculto? " + file.isHidden());
			if(exists) {
				System.out.println("Deletado? " + file.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
