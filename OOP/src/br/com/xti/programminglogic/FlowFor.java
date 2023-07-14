package br.com.xti.programminglogic;

public class FlowFor {
	public static void main(String[] args){
		for(int i=0; i<3; i++){
			System.out.println(i);
		}
		
		String text = "";
		
		for(int i=0; i<5; i++){
			text += i + ", ";
		}
		
		System.out.println(text);
		
		// decrease
		for(int i=10; i>=0; i--){
			System.out.println(i);
		}
		
		// only even numbers
		for(int i=0; i<=100; i++){
			if(i%2 == 0){
				System.out.print(i + ",");
			};
		}
		
		// build a square
		int squadLength = 5;
		for(int i=0; i<squadLength; i++){
			for(int j=0; j<squadLength; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}