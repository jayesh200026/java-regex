package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";

		String firstName = "Jay";

		if (Pattern.matches(FIRST_NAME, firstName)) { // USECASE1
			System.out.println("Valid first name");
		} else {
			System.out.println("Invalid");
		}

	}

}
