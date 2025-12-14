package sunbeam.com;

import java.util.Scanner;

public class StringLengthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        try {
	            System.out.println("Enter a string:");
	            String str = sc.nextLine();

	            int len = str.length();
	            System.out.println("Length of string: " + len);

	            if (len > 80) {
	                throw new ExceptionLineTooLong();
	            }

	            System.out.println("String length is within limit.");

	        } catch (ExceptionLineTooLong e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();

	}

}
