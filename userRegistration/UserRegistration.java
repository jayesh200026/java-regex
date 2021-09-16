package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";

		final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
		final String domain = "\\@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

		final String EMAIL = username + domain;

		String firstName = "Jayesh";
		String lastName = "Kumar";
		String email = "jayeshkumar8660@gmail.com";

		if (Pattern.matches(FIRST_NAME, firstName)) { // USECASE1
			System.out.println("Valid first name");
		} else {
			System.out.println("Invalid first name");
		}

		if (Pattern.matches(LAST_NAME, lastName)) { // USECASE2
			System.out.println("Valid last name");
		} else {
			System.out.println("Invalid last name");
		}

		if (Pattern.matches(EMAIL, email)) { // USECASE3
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email");
		}

	}

}
