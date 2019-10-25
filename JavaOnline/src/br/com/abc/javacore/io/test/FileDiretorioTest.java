package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) {

		File diretorio = new File("C:\\Users\\enovais\\Desktop\\folder-java");
		boolean mkdir = diretorio.mkdir();
		System.out.println("Criou diret�rio? " + mkdir);
		
		File arquivo = new File(diretorio, "arquivo.txt"); // dessa forma setamos o arquivo pra ser criado no diret�rio nosso
		try {
			boolean newFile = arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Criou arquivo no diret�rio? " + arquivo);
		File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
		boolean renamed = arquivo.renameTo(arquivoNovoNome); // renameTo precisa de uma inst�ncia de File pra renomear
		System.out.println("Foi renomeado o arquivo? " + renamed);
		File dirRen = new File("C:\\Users\\enovais\\Desktop\\folder2-java");
		boolean direReno = diretorio.renameTo(dirRen);
		System.out.println("Diret�rio foi renomeado? " + direReno);
		buscarArquivos();
	}
	
	public static void buscarArquivos() {
		File file = new File("C:\\Users\\enovais\\Desktop\\folder2-java");
		String[] lista = file.list(); // retorna o que tem na file (no caso diret�rio folder2-java) em formato de array
		for(String arquivos : lista) {
			System.out.println(arquivos);
		}
	}

}
