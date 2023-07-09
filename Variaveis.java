/**
* Apresentar os conceitos de variaveis
* @author: Erick A. da Silva
*/
public class Variaveis {
	
	public static void main(String[] args){
		
		int idade = 31; 
		double preco = 12.49;
		char genero = 'F'; 
		boolean casado = true;
		
		byte b = 127; 
		short s = 32767; 
		int i = 2_000_000_000;
		long l = 9_000_000_000_000_000_000L;
		double d = 1.7976931348623157E+308;
		float f = 123f;
		
		byte bb = 0b01010101; // 8 bits = 1 byte
		short ss = 0b0101010101010101; // 16 bits = 2 bytes
		int ii = 0b01010101010101010101010101010101; // 32 bits = 4 bytes
		
		System.out.println(ii);
		
	}
	
}