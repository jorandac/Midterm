package grandcircus.co.midterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

	/**
	 * Get any valid integer.
	 */

	public static int getInt(Scanner scnr, String prompt) {
		System.out.println(prompt);

		try {
			return scnr.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Enter a whole number, using digits.");

			scnr.nextLine();
			return getInt(scnr, prompt);

		}

	}

	/**
	 * Get any valid double.
	 */

	public static double getDouble(Scanner scnr, String prompt) {
		boolean isValid = false;

		do {
			System.out.println(prompt);
			isValid = scnr.hasNextDouble();

			if (!isValid) {
				scnr.nextLine();
				System.out.println("Enter a whole number, using digits.");
			}

		} while (!isValid);

		return scnr.nextDouble();
	}

	/**
	 * Get any valid integer between min and max.
	 */

	public static int getInt(Scanner scnr, String prompt, int min, int max) {
		boolean isValid = false;
		int number;
		do {
			number = getInt(scnr, prompt);

			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}

		} while (!isValid);
		return number - 1;
	}

	/**
	 * Get any string basic
	 */

	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

	/*
	 * Get String and also validate it's information
	 */

	public static String getStringIcedOrHot(Scanner scnr, String prompt) {
		System.out.println(prompt);
		String input = scnr.nextLine().toLowerCase();
		boolean isValid = false;

		do {
			if (input.matches("^(iced|hot)$")) {
				isValid = true;
				// System.out.print("valid String");
				return input;

			} else {
				isValid = false;
				System.out.println("please enter \"iced\" or \"hot\"");
				return getString(scnr, prompt);

			}
		} while (isValid == false);

	}

	/*
	 * Validator for small medium or large
	 */

	public static String getStringSize(Scanner scnr, String prompt) {
		System.out.println(prompt);
		String input = scnr.nextLine().toLowerCase();
		boolean isValid = false;

		do {
			if (input.matches("^(samll|medium|large)$")) {
				isValid = true;
				// System.out.print("valid String");
				return input;

			} else {
				isValid = false;
				System.out.println("please enter \"small\" or \"medium\" or \"large\"");
				return getString(scnr, prompt);

			}
		} while (isValid == false);

	}

	/*
	 * String Validator with valid information
	 * 
	 */

	public static String getStringWithValidInformation(Scanner scnr, String prompt) {
		System.out.println(prompt);
		String userInput = scnr.nextLine();
		boolean isValid = false;

		do {
			if (userInput.matches("[a-zA-Z\\s]+")) {
				isValid = true;
				// System.out.print("valid String");
				return userInput;

			} else {
				isValid = false;
				System.out.println(" That data does not exist. Please try again.please enter valid answer");
				return getString(scnr, prompt);

			}
		} while (isValid == false);

	}

	/**
	 * Get a string of input from the user that must match the given regex.
	 */
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	/*
	 * Get a date from user input in the format mm/dd/yyyy
	 */

	public static Date getDate(Scanner scnr, String prompt) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		format.setLenient(false);
		boolean isValid = false;
		Date date = null;
		String input;
		do {
			// Step1: get the raw string
			input = getString(scnr, prompt);

			// Step2: convert it to a date
			try {
				date = format.parse(input);
				isValid = true;
			} catch (ParseException ex) {
				isValid = false;
				System.out.println("Enter a valid date in format mm/dd/yyy.");
			}
		} while (!isValid);
		return date;
	}

	/*
	 * Validates Yes or No
	 */

	public static String YesOrNo(Scanner scnr, String prompt) {
		String userInput;
		boolean isValid = false;
		do {
			userInput = getString(scnr, prompt);
			if (userInput.equals("yes")) {
				isValid = true;
				return userInput;
			} else if (userInput.equals("no")) {
				isValid = true;

			} else if (!userInput.equals("yes") || !userInput.equals("no")) {
				System.out.println("Only enter yes or no");
				isValid = false;
				return YesOrNo(scnr, prompt);
			}

		} while (isValid = false);
		return userInput;

	}

}