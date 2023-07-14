package br.com.xti.programminglogic;

import java.util.ArrayList; 

public class MyArrayList {
	public static void main(String[] args){
		
		ArrayList<String> colors = new ArrayList<>();
		
		// add
		colors.add("White");
		colors.add(0, "Red"); //  selects position
		colors.add("Yellow");
		colors.add("Blue");
		
		// listing and getting info
		System.out.println(colors.toString());
		System.out.println("Length: " + colors.size());
		System.out.println("Element 2: " + colors.get(2));
		System.out.println("Index of \"Blue\": " + colors.indexOf("Blue"));
		System.out.println("Has \"Red?\" " + colors.contains("Red"));
		
		// remove
		colors.remove("White");
			
		
	}
}