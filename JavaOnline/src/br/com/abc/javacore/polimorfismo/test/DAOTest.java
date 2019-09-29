package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;

public class DAOTest {
	
	public static void main(String[] args) {
		
		GenericDAO arquivoDAO = new DatabaseDAOImpl();
		arquivoDAO.save();
		
	}
	
}
