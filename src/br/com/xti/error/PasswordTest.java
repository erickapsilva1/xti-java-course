package br.com.xti.error;

public class PasswordTest {

	static void authenticate(String password) throws InvalidPasswordException {
		if("123".equals(password)) {
			System.out.println("Authenticated!");
		}else {
			throw new InvalidPasswordException("Incorrect password!");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			authenticate("1233");
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
