package br.com.xti.oop;

public class MathTest {

	public static void main(String[] args) {
		
		Math math = new Math();
		int biggest = math.biggest(10, 20);
		System.out.println(biggest);
		
		double sum = math.sum(10, 99);
		System.out.println(sum);
		
		System.out.println(math.root(9));
		System.out.println(math.root(81));
		System.out.println(math.root(27));
	}

}
