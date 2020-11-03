
/**  Author name : MEGHANA T
     date: 03/11/2020
     desc: testing compilation and running Exception handler function for Invalid name exception
*/

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class NameException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String first_name = sc.nextLine();
		System.out.println("Enter the last name:");
		String last_name = sc.nextLine();
		try {
			if (first_name.length() == 0 || last_name.length() == 0) {
				throw new InvalidNameException(" provide a valid input");
			} else
				System.out.println("Your name is " + first_name + " " + last_name);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
	}

}
