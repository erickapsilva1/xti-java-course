package br.com.xti.programminglogic;

public class FlowIII {
	public static void main(String[] args){
		
		// braak
		while(true){
			System.out.print("In!");
			break;
		}
		
		System.out.println("");
		
		// break
		for(int i=0; i<10; i++){
			if(i == 5){
				break;
			}
			System.out.print(i + ",");
		}
		
		System.out.println("");
		
		// continue
		for(int i=0; i<10; i++){
			if(i == 5){
				continue;
			}
			System.out.print(i + ",");
		}
		
		System.out.println("");
		
		// labels
		first:
		for(int i=0; i<10; i++){
			System.out.print(i + ",");
			second:
			for(int j=0; j<10; j++){
				System.out.print(j + ",");
				if(j == 5){
					break first;
				}
			}
		}
		
		System.out.println("");
		
		// labels
		boolean[][] matrix = 
		{
			{false,true,false,false,false},
			{false,false,false,false,false}
		};
		
		search:
		for(int i=0; i<matrix.length; i++){
			System.out.print("A ");
			for(int j=0; j < matrix[i].length; j++){
				if(matrix[i][j]){
					System.out.print("TRUE! ");
					break search;
				}
				System.out.print("B ");
			}
		}
		
	}
}