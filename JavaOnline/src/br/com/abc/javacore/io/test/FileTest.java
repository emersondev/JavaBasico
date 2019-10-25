package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		// até os 4 minutos
		
		// estamos instanciando a file com o caminho onde vai ser criado o Arquivo, é necessário escapar a barra
		File file = new File("c:\\Users\\enovais\\Desktop\\Arquivo_de_Criacao.txt");
		// usar o file, devemos colocar um tratamento de exceção
		// método que executa a criação
		try {
			System.out.println("Arquivo foi criado? " + file.createNewFile());
			boolean exists = file.exists();
			System.out.println("Arquivo existe? " + exists);
			System.out.println("Permissão de leitura? "+ file.canRead());
			System.out.println("Onde o arquivo está? (Path do Arquivo): " + file.getPath());
			System.out.println("Caminho absoluto do arquivo? " + file.getAbsolutePath());
			System.out.println("É um diretório? " + file.isDirectory());
			System.out.println("Última modificação? " + new Date(file.lastModified()));
			System.out.println("É um arquivo oculto? " + file.isHidden());
			if(exists) {
				System.out.println("Deletado? " + file.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
