package br.com.xti.debug;

public class DebugExample {
	
	int result;
	
	public int square(int number) {
		int square = 0, even = 1;
		while(number >= even) {
			number -= even;
			even += 2;
			++square;
		}
		return square;
	}
	
	public static void main(String[] args) {
		
		int number = 16;
		DebugExample debugExample = new DebugExample();
		int square = debugExample.square(number);
		
		if(square == 4) {
			System.out.println("Correct square.");
		}
		

	}

}
