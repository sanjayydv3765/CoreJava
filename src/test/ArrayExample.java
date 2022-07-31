package test;

public class ArrayExample {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 };
		System.out.println("The length of an array is " + array1.length);
		System.out.println("The Second number is " + array1[0]);

		System.out.println("The Last nymber is" + array1[array1.length - 1]);
		String[] array2 = { "abc", "pqr", "xyz" };

		// String[] array3 = {"clean","world","green","world"}//
		String str1 = "Clean World Green World";

		String[] array3 = str1.split("");
		System.out.println("The first word is" + array3[0]);
	}
}
