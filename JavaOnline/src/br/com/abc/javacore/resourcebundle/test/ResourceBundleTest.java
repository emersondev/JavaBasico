package br.com.abc.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		
		System.out.println("EM PT-BR");
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR")); // passa como par�metro o primeiro nome do arquivo antes do underscore e depois o objeto de Locales
		System.out.println(rb.getString("ola")); // getString troca pelo que tiver no Resource Bundle
		System.out.println(rb.getString("bom.dia"));
		
		System.out.println("\n\n\nEM EN-US");
		rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println(rb.getString("ola")); // getString troca pelo que tiver no Resource Bundle
		System.out.println(rb.getString("bom.dia"));
		
		/**
		 * tem uma forma como o Java procura o ResourcesBundle
		 * 
		 * Locale locale = new Locale("fr", CA"); // quero a linguagem francesa do Canad�
		 * ResourceBundle.getBundle("messages", locale); // vou procurar no ResourceBundle de acordo com a locale informada
		 * messages_fr_CA.properties // primeiro ele vai buscar exatamente de acordo com a locale
		 * messages_fr.properties // depois ele vai procurar somente pela linguagem francesa
		 * messages_pt_BR.properties // ele vai procurar pela localiza��o local da sua m�quina
		 * messages_pt.properties // procura pela linguagem padr�o da sua m�quina
		 * messages.properties // procura pelo base name
		 * // caso ele n�o encontre, ai sim ele lan�a uma exception
		 */
		
		
		
		
		
		

	}

}
