package test;

public class DataTypeExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		// int sum =num1+num2;//
		int mul = num1 * num2;
		float div =(float) num1 / num2;

		// System.out.println("The Sum of two numbers is " +sum);//
		System.out.println("The Sum of two numbers is " + (num1 + num2));
		System.out.println("The multiplication of two numbers is " + mul);
		System.out.println("The division of two number is " + div);
		String str1="clean world green world";
		
		System.out.println(str1);
		System.out.println("The length of the String is " +str1.length());
		char ch1=str1.charAt(0);
		System.out.println("The first char is " +ch1);
		char ch2 = str1.charAt(str1.length()-1);
		
		System.out.println("The length of the String is " +ch2);
		System.out.println("The String in lower case is" +str1.toLowerCase());
		System.out.println("The String in upper case is " +str1.toUpperCase());
		
	}
}
