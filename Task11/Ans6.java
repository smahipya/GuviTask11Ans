package Task11;

import java.util.Scanner;

public class Ans6 {
	final static String EXPECTED_PASSWORD = "password@1234";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		
		System.out.println("Enter user name :");
		  String username= obj.nextLine();
		  
		  System.out.println("Enter user password :");
		  String userpassword =obj.nextLine();
		  
		  try {
	          if (validatePassword(userpassword)) {
	              System.out.println("Login successful!");
	          } else {
	              throw new IncorrectPasswordException();
	          }
	      } catch (IncorrectPasswordException e) {
	          System.out.println("Error: Incorrect password entered.");
	      }
	}

	  private static boolean validatePassword(String password) {
	      return password.equals(EXPECTED_PASSWORD);
	  }

	  static class IncorrectPasswordException extends Exception {
	      // Custom exception for incorrect password
	  
	}

}
