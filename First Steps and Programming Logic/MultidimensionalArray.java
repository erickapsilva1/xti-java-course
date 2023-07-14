public class MultidimensionalArray {
	public static void main(String[] args){
		
		String[][] twoDimensions = 
		{
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "MG"},
			{"Beatriz", "O", "DF"},
			{"Lawrence", "M", "PA"},
			{"Laura", "F", "RJ"},
			{"Juliana", "O", "SP"}
		};
		
		// access positions of array
		System.out.println(twoDimensions[0][0]); // ricardo
		System.out.println(twoDimensions[1][0]); // sandra
		
		// array / inside array length
		System.out.println(twoDimensions.length);
		System.out.println(twoDimensions[0].length);
		
		// changing multidimensional array
		twoDimensions[3][0] = "BEATRIZ";
		System.out.println(twoDimensions[3][0]);
		
	}
}