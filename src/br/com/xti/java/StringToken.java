package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {
		
		String technologies = "XHTML; CSS; JAVA; JAVASCRIPT; JQUERY";
		String[] tokens = technologies.split(";");
		
		System.out.println("Tokens: " + tokens.length);
		for(String token : tokens) {
			System.out.println(token.trim());
		}
			
	}

}
