package br.com.xti.programminglogic;

/**
* Apresentar os conceitos de classes wrapper
* @author: Erick A. da Silva
*/
public class WrapperClasses {
	
	public static void main(String[] args){
		
		Integer idade = Integer.valueOf(32); 
		
		Double preco = Double.valueOf(12.49);
		Double preco2 = Double.valueOf("12.55");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		
		Character genero = Character.valueOf('F'); 
		Boolean casado = Boolean.valueOf(true);
		
		// Conversao estatica
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float g1 = Float.parseFloat("3.1415F");
		
	}
}