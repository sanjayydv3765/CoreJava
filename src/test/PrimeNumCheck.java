package test;

import java.util.Scanner;

public class PrimeNumCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide number ");
		int num = scanner.nextInt();
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			int rem = num % i;
			if (rem == 0) {
				System.out.println("Number is not a prime number");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Number is prime number");
		}
	}
}
