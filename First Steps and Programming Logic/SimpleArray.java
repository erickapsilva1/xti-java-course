import java.util.Arrays;

public class SimpleArray {
	public static void main(String[] args){
		
		String[] contries = {"Brazil", "Russia", "India", "China"};
		
		// access position
		System.out.println(contries[0]);
		
		// change array value
		contries[0] = "BRAZIL";
		System.out.println(contries[0]);
		
		// odd numbers
		int[] odd = new int[5];
		odd[0] = 1;
		odd[1] = 3;
		odd[2] = 5;
		odd[3] = 7;
		odd[4] = 9;
		
		// find array length
		System.out.println(odd.length);
		
		// handling array
		// list
		System.out.println(Arrays.toString(odd));
		
		// search
		int position = Arrays.binarySearch(contries, "Russia");
		System.out.println(position);
		
		// order
		Arrays.sort(contries, 0, contries.length);
		System.out.println(Arrays.toString(contries));

		// it's possible to access object's methods inside of array
		Double[] values = {2.0, 99.87, 47.98};
		System.out.println(values[0].doubleValue());
	}
}