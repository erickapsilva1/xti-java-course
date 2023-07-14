package br.com.xti.programminglogic;

public class FibonacciChallengeII {
	public static void main(String[] args){
		/*
		*
		* The Fibonacci sequence is a series of numbers where each number 
		* is the sum of the two preceding ones. It starts with 0 and 1, and 
		* the subsequent numbers are generated by adding the previous 
		* two numbers together. So the sequence goes like this: 
		* 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. It continues infinitely.
		*/
		
		int previous = 0;
		int next = 1;
		System.out.println(previous);
		
		while(next <= 50){
			System.out.println(next);
			next = next + previous;
			previous = next - previous;
		}
	}
}