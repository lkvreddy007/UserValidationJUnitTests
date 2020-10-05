package main.java.org.capg;

import java.util.regex.Pattern;

public class UserValidatorLambda {
	static final String NAME_PATTERN="[A-Z][a-z]{2,}";
	private static final String EMAIL_ID="^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2})?$";
	private static final String PHONENO="[0-9]{2} {1}9[0-9]{9}";
	private static final String PASSWORD="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
	ValidatorInterface firstNameValid=(input)->{
		boolean b= (Pattern.compile(NAME_PATTERN)).matcher(input).matches();
		if(b) {
			return b;
		}
		else {
			throw new UserInputInvalidException("Invalid First Name");
		}
	};
	
	ValidatorInterface lastNameValid=(input)->{
		boolean b= (Pattern.compile(NAME_PATTERN)).matcher(input).matches();
		if(b) {
			return b;
		}
		else {
			throw new UserInputInvalidException("Invalid Last Name");
		}
	};
	
	ValidatorInterface emailValid=(input)->{
		boolean b= (Pattern.compile(EMAIL_ID)).matcher(input).matches();
		if(b) {
			return b;
		}
		else {
			throw new UserInputInvalidException("Invalid Email");
		}
	};
	
	ValidatorInterface phoneNumberValid=(input)->{
		boolean b= (Pattern.compile(PHONENO)).matcher(input).matches();
		if(b) {
			return b;
		}
		else {
			throw new UserInputInvalidException("Invalid Phone number");
		}
	};
	
	ValidatorInterface passwordValid=(input)->{
		boolean b= (Pattern.compile(PASSWORD)).matcher(input).matches();
		if(b) {
			return b;
		}
		else {
			throw new UserInputInvalidException("Invalid Password");
		}
	};
}
