package br.com.abc.javacore.exception.checkedexception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import br.com.abc.javacore.exception.chackedexception.classes.Leitor1;
import br.com.abc.javacore.exception.chackedexception.classes.Leitor2;

public class TryWithResourcesTest {

	public static void main(String[] args) throws Exception {
		lerArquivo2();
		

	}
	
	// você não precisa colocar mais o catch
	public static void lerArquivo() throws FileNotFoundException, IOException {
		/**
		 * somente pode colocar dentro do Try With Resources classes que tenham a interface closeable ou auto closeable
		 * não precisamos mais nos preocupar em fechar, pois caso não houver esse arquivo o java fecha
		 */
		try(Reader reader = new BufferedReader(new FileReader("teste.txt"));
			Reader reader2 = new BufferedReader(new FileReader("teste.txt"))) {
		} 
	}
	
	public static void lerArquivo2() throws Exception {
		// ele encerra de baixo pra cima
		try(Leitor2 leitor2 = new Leitor2();
			Leitor1 leitor1 = new Leitor1()) {
		} 
	}
	
	public static void lerArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
