package org.capg;

import java.util.regex.Pattern;

public class UserValidator {
	private static final String NAME_PATTERN="[A-Z][a-z]{2,}";
	private static final String EMAIL_ID="^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2})?$";
	private static final String PHONENO="[0-9]{2} {1}9[0-9]{9}";
	private static final String PASSWORD="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
	public String analyseMood(String message) {
		if(message.contains("sad")) {
			return "SAD";
		}else {
			return "HAPPY";
		}
	}
	
	public boolean validateFirstName(String fname) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}
	
	public boolean validateLastName(String lname) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}
	
	public boolean validateEmail(String email) {
		Pattern pattern=Pattern.compile(EMAIL_ID);
		return pattern.matcher(email).matches();
	}
	
	public boolean validatePhoneNo(String phoneno) {
		Pattern pattern=Pattern.compile(PHONENO);
		return pattern.matcher(phoneno).matches();
	}
	
	public boolean validatePassword(String password) {
		Pattern pattern=Pattern.compile(PASSWORD);
		return pattern.matcher(password).matches();
	}
}
