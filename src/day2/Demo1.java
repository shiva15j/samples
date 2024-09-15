package day2;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");
		String username = sc.next();

		System.out.println("pin=:");
		int pin = sc.nextInt();

		if (username.equals("Shivam") && pin == 1234) {
			System.out.println("You are welcome");
		} else {
			System.out.println("Invalid Credentails");
		}

	}

}
