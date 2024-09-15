package day2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Operator=:");
		String opr = sc.next();

		System.out.println("num1=:");
		int num1 = sc.nextInt();

		System.out.println("num2=:");
		int num2 = sc.nextInt();

		if (opr.equals("+")) {
			int sum = num1 + num2;
			System.out.println("Yhe Sum=:" + sum);
		} else if (opr.equals("-")) {
			int sub = num1 - num2;
			System.out.println("The Sub=:" + sub);
		} else if (opr.equals("*")) {
			int mul = num1 * num2;
			System.out.println("The Mul=:" + mul);
		} else if (opr.equals("/")) {
			int div = num1 / num2;
			System.out.println("The div=:" + div);
		} else {
			System.out.println("Invalid Operator");
		}

	}

}
