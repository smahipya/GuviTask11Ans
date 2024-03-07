package Task11;

import java.util.Scanner;

public class Ans7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter valid age :");
		int age = obj.nextInt();

		try {
			validateAge(age);
			System.out.println("Age is valid!");

		} catch (InvalidAgeException e) {
			System.out.println("Error: Entered age is invalid " + e);
		}

	}

	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
	}

	static class InvalidAgeException extends Exception {

		public InvalidAgeException(String msg) {
		}

	}

	}


