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
		String brazil = "The Brazil is Beatiful!";
//		brazil.substring(14);					 // extract from position "x"
		
		
	}

}
