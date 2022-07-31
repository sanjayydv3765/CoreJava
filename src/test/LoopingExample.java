package test;

public class LoopingExample {
	public static void main(String[] args) {
		int num = 2;
		// till 10
		while (num <= 10) {
			if (num == 6) {
				num = num + 2;
				continue;
			} else {
				System.out.println(num);
				// num=num +1;
			}
			num = num + 2;

		}
		for (int i = 1; i < 10; i++)
		{
			if (i == 6) {
				break;
			}
			System.out.println("i");
		}
		System.out.println("After For Loop");
			int[] array1 = { 10, 20, 30, 40 };
			for (int num1:array1) {
				System.out.println(num1);
			}
			// Write the logic to print all the array values using normal for loop
			for(int i=0; i<array1.length;i++) {
				System.out.println("test"+array1[i]);
			}
	}
}

