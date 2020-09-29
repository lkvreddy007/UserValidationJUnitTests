package org.capg;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
	static String firstName;
	static String lastName;
	static String email;
	static String phoneNo;
	static String password;
	static Scanner sc=new Scanner(System.in);

	public static boolean matche(String regex,String input) {
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		boolean b=m.matches();
		return b;
	}
	
	public static void setFirstName(){
		boolean flag=true;
		String pattern="[A-Z][a-z]{2,}";
		while(flag) {
			System.out.println("Enter the First Name:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				firstName=input;
				flag=false;
				System.out.println("Valid First Name");
			} 
			else {
				System.out.println("Enter a name that starts with Cap and has min 3 chars");
			}
		}
	}
	
	public static void setLastName(){
		boolean flag=true;
		String pattern="[A-Z][a-z]{2,}";
		while(flag) {
			System.out.println("Enter the Last Name:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				lastName=input;
				flag=false;
				System.out.println("Valid Last Name");
			} 
			else {
				System.out.println("Enter a name that starts with Cap and has min 3 chars");
			}
		}
	}
	
	public static void setEmailId() {
		boolean flag=true;
		String pattern="^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2})?$";
		while(flag) {
			System.out.println("Enter the Email:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				email=input;
				flag=false;
				System.out.println("Valid Email Id");
			} 
			else {
				System.out.println("Enter mail in abc.xyz@bl.co.in format");
			}
		}
	}
	
	public static void setPhoneNo() {
		boolean flag=true;
		String pattern="[0-9]{2} {1}9[0-9]{9}";
		while(flag) {
			System.out.println("Enter the Phone number:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				phoneNo=input;
				flag=false;
				System.out.println("Valid Phone number");
			} 
			else {
				System.out.println("Enter phone number in 91 9XXXXXXXXX format");
			}
		}
	}
	
	public static void setPassword() {
		boolean flag=true;
		String pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		while(flag) {
			System.out.println("Enter the Password:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				password=input;
				flag=false;
				System.out.println("Valid Password");
			} 
			else {
				System.out.println("Password should have atleast 8 characters, atleast one char in caps and one digits");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		setFirstName();
		setLastName();
		setEmailId();
		setPhoneNo();
		setPassword();
	}
}
