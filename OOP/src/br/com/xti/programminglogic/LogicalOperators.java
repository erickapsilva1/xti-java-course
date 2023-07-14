package br.com.xti.programminglogic;

public class LogicalOperators {
	public static void main(String[] args){
		// AND
		int x = 6;
		System.out.println((x >= 1) && (x <= 10));
		System.out.println((x >= 1) && (x <= 5));
		
		// OR
		System.out.println((x >= 1) || (x <= 5));
		
		//NOT
		System.out.println(!(x >= 1));
	}
}