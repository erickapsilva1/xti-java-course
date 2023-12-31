package br.com.xti.programminglogic;

public class FibonacciChallenge {
	public static void main(String[] args){
		/*
		*
		* The Fibonacci sequence is a series of numbers where each number 
		* is the sum of the two preceding ones. It starts with 0 and 1, and 
		* the subsequent numbers are generated by adding the previous 
		* two numbers together. So the sequence goes like this: 
		* 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. It continues infinitely.
		*/
		
		int n1 = 0;
		int n2 = 0;
		int n_aux = 0;
		int target = 100;
		
		for(int i = 0; i <= target; i++){
			if(n1 <= target){
				System.out.print(n1 + ", ");
				
				if(i == 0 || i == 1){
					n1 = 1;
					n_aux = n1;
					n2 = 0;
				}else{
					n2 = n1;
					n1 = n2 + n_aux;
					n_aux = n2;
				};			
			};
		};
	}
}