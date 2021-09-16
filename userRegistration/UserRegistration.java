package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";

		String firstName = "Jayesh";
		String lastName = "Kumar";

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

	}

}
