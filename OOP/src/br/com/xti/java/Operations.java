package br.com.xti.java;

public class Operations {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + "Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		// basic operations
		int length = s1.length();                // length of a string
		char charecter = s1.charAt(0);           // specific position
		String text = s1.toString();             // string itself
		
		// location
		s3.indexOf('J');                         // first occurrence of a char 
		s3.indexOf("Virtual");		             // first occurrence of a string
		s3.lastIndexOf('a');		             // last occurrence of a char
		s3.isEmpty();				             // check if it is empty
		
		// compare
		String xti = "XTI";
		boolean x = xti.equals("xti");           // compare if it is equal
		boolean y = xti.equalsIgnoreCase("xti"); // compare if it is equal ignoring case
		boolean z = xti.startsWith("X");         // check if it starts with specific text
		boolean w = xti.endsWith("A");			 // check if it ends with specific text
		int b = "Café".compareTo("Chimarrão");   // compare values (negative = before; positive = after)
		int c = "123".compareTo("312");			 // it works with numbers
		String st = "Look up!";
		boolean s = 
			st.regionMatches(5, "up", 0, 2);	 // searching and compare strings 
		boolean v = 
		st.regionMatches(true, 5, "up", 0, 2);   // searching and compare strings ignoring case
		
		// extraction
		String brazil = "The Brazil is Beautiful!";
		String myWord = brazil.substring(14);	 // extract from position "x"
		System.out.println(myWord);
		String pieceOfString = 
				brazil.substring(4, 10);
		System.out.println(pieceOfString);		 // extract a piece of a string
		
		// union
		String phrase = "Java is ";
		phrase.concat("great!");
		System.out.println(phrase.concat("great!"));  // union a string to another one
		
		// change characters
		String strDemo = "Data Science";
		strDemo = strDemo.replace("Science", "Analysis");
		System.out.println(strDemo);               // change part of a string
		strDemo = strDemo.replaceFirst("A", "X");
		System.out.println(strDemo);              // change the first occurrence
		strDemo = strDemo.replaceAll(" ", "");	  // change all occurrences
		System.out.println(strDemo);
		
		// cases
		String myString = "Abc";
		myString.toLowerCase();					// lower case
		myString.toUpperCase();					// upper case
		
		// remove blank spaces
		myString = "   Abc   ";
		myString.trim();
		
	}

}
