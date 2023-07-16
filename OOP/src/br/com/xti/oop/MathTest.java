package br.com.xti.oop;

public class MathTest {

	public static void main(String[] args) {
		
		Math math = new Math();
		int biggest = math.biggest(10, 20);
		System.out.println(biggest);
		
		double sum = math.sum("Sum: ", 10, 99, 998, 1, 814);
		System.out.println(sum);
		
		System.out.println(math.root(9));
		System.out.println(math.root(81));
		System.out.println(math.root(27));
		
		System.out.println(math.average(5, 2));
		System.out.println(math.average("10", "87"));
		System.out.println(math.average(3, 2, 9));
		System.out.println(math.average(3, 2, 9, 85, 1, 3));
	}

}
