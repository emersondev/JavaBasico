package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

	public static void main(String[] args) {

		File file = new File("Arquivo.txt");
		try(FileWriter fw = new FileWriter(file, true);
			FileReader fr = new FileReader(file)) {
			fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha\n");
			fw.flush();
			char[] in = new char[70];
			int size = fr.read(in);
			System.out.println("tamanho " + size);
			for(char c: in) {
				System.out.print(c);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		try {
//			FileWriter fw = new FileWriter(file, true); // primeiro parâmetro é o arquivo a ser escrito, o segundo parâmetro é o append (em booleano), se não tiver o append, ele sobrescreve o arquivo, pois por padrão ele é false
//			fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha\n");
//			fw.flush(); // entre a escrita do java e o arquivo a ser escrito, tem um caminho que manda toda a escrita, o flush "gospe tudo" que tiver no caminho para o documento
//			fw.close();
//			
//			FileReader fr = new FileReader(file);
//			char[] in = new char[70]; // numero de caracteres aceitos no array
//			int size = fr.read(in); // read coloca o resultado nela em um array, por isso a necessidade de criar um array
//			System.out.println("tamanho " + size);
//			for(char c: in) { // vai imprimir cada caracter lido no array
//				System.out.print(c);
//			}
//			fr.close(); // fecha o arquivo
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
