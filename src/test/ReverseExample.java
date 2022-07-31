package test;

import java.util.Scanner;

public class ReverseExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String result="";
       for(int i=str.length()-1; i>=0; i--) {
    	   char ch = str.charAt(i);
    	   result =result+ch;
       }
       System.out.println("Reverse String is "+result);
       
       int res=0;
       System.out.println("Enter the Number");
       int num =sc.nextInt();
       while(num>0) {
    	   int rem= num%10;
    	   
    	   res = res*10 +rem;
    	   num=num/10;
       }
      System.out.println(" Reverse number is "+res); 
	}

}
