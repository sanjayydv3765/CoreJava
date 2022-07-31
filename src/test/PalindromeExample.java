package test;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[] args) {
		String original, temp;
		System.out.println("Please enter a String ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		String reverse = "";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		System.out.println("Reverse String is " + reverse);
		if (original.equals(reverse))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	System.out.println("Please enter the number");
	{
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	
	int rever, sum=0;
	while(num>0)
	{
		rever = num % 10;
		sum = (sum*10) + rever;
		num = num / 10;

	}
	System.out.println("Reverse number is"+sum);
	}
	}
}
