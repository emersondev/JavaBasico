package br.com.abc.javacore.wrappers.test;

public class WrappersTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10L;
		float floatPrimitivo = 10F;
		double doublePrimitivo = 10D;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = new Integer("10"); // podemos colocar uma String com exceção do char
		Long longWrapper = Long.valueOf("10"); // sou obrigado a passar L nessas classes, ou usando String com valueOf
		Float floatWrapper = 10F; // sou obrigado a passar F nessas classes
		Double doubleWrapper = 10D; // sou obrigado a passar D nessas classes
		Character characterWrapper = 'A';
		Boolean booleanWrapper = true;
		
		// unboxing
		int a = integerWrapper;
		
		String valor = "10";
		Float f = Float.parseFloat(valor);
		System.out.println(f);
		System.out.println(Character.isDigit('9'));
		
		
	}
	
}
