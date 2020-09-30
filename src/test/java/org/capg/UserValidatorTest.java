package org.capg;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
	//TestCase for MoodAnalyser
	@Test
	public void testMoodAnalysis() throws Exception{
		UserValidator moodAnalyser=new UserValidator();
		String mood=moodAnalyser.analyseMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	
	//TestCases for FirstName
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateFirstName("Krishna");
			Assert.assertTrue(result);
		} 
		catch (FirstNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateFirstName("Kr");
			Assert.assertFalse(result);
		} 
		catch (FirstNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenFirstName_WhenHasSplChars_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateFirstName("Krishna@");
			Assert.assertFalse(result);
		} 
		catch (FirstNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenFirstName_WhenFirstCharIsSmall_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateFirstName("krishna");
			Assert.assertFalse(result);
		} 
		catch (FirstNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	//TestCases for LastName
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateLastName("Krishna");
			Assert.assertTrue(result);
		} 
		catch (LastNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateLastName("Kr");
			Assert.assertFalse(result);
		} 
		catch (LastNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenLastName_WhenHasSplChars_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateLastName("Krishna@");
			Assert.assertFalse(result);
		} 
		catch (LastNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenLastName_WhenFirstCharIsSmall_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validateLastName("krishna");
			Assert.assertFalse(result);
		} 
		catch (LastNameInvalidException e) {
			System.out.println(e);
		}
	}
	
	//TestCases for Phone
	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePhoneNo("91 9490067618");
			Assert.assertTrue(result);
		} 
		catch (PhoneNumberInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPhoneNo_WhenNoSpaceAfterCountryCode_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePhoneNo("919490067618");
			Assert.assertFalse(result);
		} 
		catch (PhoneNumberInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePhoneNo("91 9490067");
			Assert.assertFalse(result);
		} 
		catch (PhoneNumberInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPhoneNo_NoCountryCode_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePhoneNo(" 9490067618");
			Assert.assertFalse(result);
		} 
		catch (PhoneNumberInvalidException e) {
			System.out.println(e);
		}
	}
	
	//TestCaseForPassword
	@Test
	public void givenPassword_WhenProper_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("Abc@1234");
			Assert.assertTrue(result);
		}
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("Abc@123");
			Assert.assertFalse(result);
		} 
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPassword_WhenNoCaps_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("abc@1234");
			Assert.assertFalse(result);
		} 
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPassword_WhenNoNumber_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("Abc@jskala");
			Assert.assertFalse(result);
		} 
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPassword_WhenNoSmallCase_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("ABCD@1234");
			Assert.assertFalse(result);
		} 
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void givenPassword_WhenNoSplCase_ShouldReturnFalse() {
		UserValidator validator=new UserValidator();
		boolean result;
		try {
			result = validator.validatePassword("Abcd1234");
			Assert.assertFalse(result);
		} 
		catch (PasswordInvalidException e) {
			System.out.println(e);
		}		
	}
}
