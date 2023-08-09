package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
			
		boolean b = "Java".matches("java");
		
		// modifiers
		b = "Java".matches("(?i)java"); // ignore case
		System.out.println(b);
		
		// metacharacters
		System.out.println("@".matches("."));    // anything
		System.out.println("2".matches("\\d"));  // digit -> true
		System.out.println("a".matches("\\d"));  // digit -> false
		System.out.println("a".matches("\\w"));  // letter
		System.out.println("#".matches("\\w"));  // letter -> false
		System.out.println(" ".matches("\\s"));  // space -> true
		
		System.out.println("Pi".matches(".."));  // two anythings
		System.out.println("Pie".matches("...")); // three anythings
		System.out.println("34".matches("\\d\\d")); // two digits
		
		// check Brazilian zip code
		String zipCode = "06864-200";
		System.out.println(zipCode.matches("\\d\\d\\d\\d\\d-\\d\\d\\d"));
		
		// quantifiers
		System.out.println("34".matches("\\d{2}")); // two digits
		System.out.println("Pie".matches(".{3}")); // three anythings
		System.out.println("321".matches("\\d{2,}")); // at least 2 digits
		System.out.println("32132".matches("\\d{2,5}")); // at least 2 digits, but not more than 5 digits
		
		System.out.println("".matches(".?"));  // zero or one time -> true
		System.out.println("aa".matches(".?"));  // zero or one time -> false
		
		System.out.println("".matches(".*"));  // zero or more times -> true
		System.out.println("sdf".matches(".*"));  // zero or more times -> true
		
		System.out.println("".matches(".+"));  // one or more times -> false
		System.out.println("sdf".matches(".+"));  // one or more times -> true
		
		System.out.println(zipCode.matches("\\d{5}-\\d{3}"));
		
		// check date
		String d = "1990/01/01";
		System.out.println(d.matches("\\d{4}/\\d{2}/\\d{2}"));
		
		// frontier metacharacters
		System.out.println("Pier21".matches("^Pier.*")); // starts with
		System.out.println("Pier21".matches(".*21$")); // ends with
		System.out.println("has Java here".matches("^has.*here$")); // start and ends with
		System.out.println("has Java here".matches(".*Java.*"));  // anywhere
		System.out.println("yes".matches("yes|no")); // or
		
		// groupers
		System.out.println("x".matches("[a-z]")); // from a to z -> true
		System.out.println("2".matches("[a-z]")); // from a to z -> false
		System.out.println("A".matches("[a-z]")); // from a to z -> false
		System.out.println("4".matches("[0-9]")); // from 0 to 9 -> true
		System.out.println("true".matches("[tT]rue")); // lower or upper case -> true
		System.out.println("true".matches("[tT]rue|[yY]es")); // lower or upper case for 2 words
		System.out.println("Dante".matches("[A-Z][a-zA-Z]*")); // first letter is upper
		System.out.println("fable".matches("[^bc]able")); // cannot start with abc but end with able
		System.out.println("grew".matches("gr[ae]w")); // 'a' or 'e'
		
		// check email
		System.out.println("hr@xti.com".matches("\\w+@\\w+\\.\\w{2,3}")); // simple email validation
		String myEmailRegex = ".{1,}@.*[.].{2,3}$"; // more complex email validation
		String myEmailList[] = {
				"hr@xti.com",
				"h.r@xti.com",
				"h_r@xti.com",
				"hr@xti.com.br",
				".@xti.com.br",
				"@xti.com.br",
				"abc@xti"
		};
		for(String mail : myEmailList) {
			System.out.println(mail.matches(myEmailRegex));
		}
		
		// matcher
		String candy = "My candy, your Candy, our canDy";
		Matcher matcher = Pattern.compile("(?i)candy").matcher(candy);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		// replacement
		String r = candy.replaceAll("(?i)candy", "little candy");
		System.out.println(r);
		
		String r1 = "Peter Piper picked a peck of pickled peppers";
		r = r1.replaceAll("(?i)p[aeiou]", "XX");
		System.out.println(r);
		
		r = r1.replaceAll("\\s", "\t");
		System.out.println(r);
		
	}

}
