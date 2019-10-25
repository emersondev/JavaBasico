package br.com.abc.javacore.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

		public static void main(String[] args) {
			
			File file = new File("Arquivo.txt");
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)); // Os objetos de BufferedWriter precisam de objetos da FileWriter pra serem usadas
				BufferedReader br = new BufferedReader(new FileReader(file)); // Os objetos de BufferedReader precisam de objetos da FileReader pra serem usadas
				) {
				bw.write("Escrevendo uma mensagem no arquivo");
				bw.newLine();
				bw.write("E pulando uma linha");
				bw.flush(); // flush só é usado para escrita com o Buffered
				bw.close();
				String s = null;
				while((s = br.readLine()) != null) {
					System.out.print(s);
				}
				br.close(); // quando você faz esse encadeamento, o mais externo fecha o mais interno
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
}
