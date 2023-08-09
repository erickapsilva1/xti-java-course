package br.com.xti.programminglogic;

public class MathOperators {
	
	public static void main(String[] args){
		
		// basic operations
		double x = 7 + 3;
		double x1 = 7 * 3;
		double x2 = 7 / 3;
		double x3 = 7 - 3;
		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		// concatenate
		String x4 = "9" + "9";
		
		System.out.println(x4);
		
		// module
		System.out.println(10 % 3);
		
		// negative and positive
		double x5 = 2;
		double x6 = -2;
		double x7 = -(-2); // = +2
		
		System.out.println(x7);
		
		// increase and decrease
		int x8 = 6;
		//int y = ++x8; // pre-increase
		int y = x8++; // post-increase
		
		System.out.println("x = " + x8);
		System.out.println("y = " + y);
	}
}