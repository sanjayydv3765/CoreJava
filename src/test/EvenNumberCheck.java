package test;

import java.util.Scanner;

public class EvenNumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number \n");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is even Number");
		} else {
			System.out.println("Number is odd Number");
		}
	}
}
