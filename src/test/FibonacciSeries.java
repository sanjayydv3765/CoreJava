package test;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number till you want to Execute");
		int fb1 = 0, fb2=1, fb, i;
	
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		System.out.println(fb1+"" +fb2);
		for(i=2;i<s;++i )
		{
			
			fb = fb1 + fb2;
			System.out.println("print " + fb);
			fb1=fb2;
			fb2=fb;
			
		}
	}
}
