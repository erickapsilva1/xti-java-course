package br.com.xti.java;

public class ChangeableString {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		s1.length();
		s1.capacity();   // starts with 16
		s1.reverse();    // change the beginning to the end
		
		// add text to String
		s1.append(" is a nice programming language.");
		System.out.println(s1);
		
		char[] c = {'X', 'T', 'I'};
		s0.append(c);
		s0.append(" University");
		System.out.println(s0);
		
		String s2 = new StringBuilder("Hello ")
				.append("how ")
				.append("are")
				.append("you?").toString(); 
		
		// remove content
		StringBuffer s3 = new StringBuffer("www.xti.com.br");
		s3.delete(0, 4);
		System.out.println(s3);
	}

}
