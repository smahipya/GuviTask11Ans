package Task11;

import java.util.Scanner;

public class Ans4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a, b, c;
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter first number is : ");
			a = obj.nextInt();

			System.out.println("Enter second number is : ");
			b = obj.nextInt();

			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Catch the exception " + e.getMessage());
			System.out.println(e);
		}

	}

}
