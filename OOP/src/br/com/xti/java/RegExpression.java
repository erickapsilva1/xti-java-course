package br.com.xti.java;

public class RegExpression {

	public static void main(String[] args) {
		
		String pattern = "Java";
		String text = "Java";
		
		boolean b = text.matches(pattern);
		System.out.println(b);

	}

}
