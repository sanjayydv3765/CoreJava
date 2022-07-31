package test;

public class ConditionsExample {
public static void main(String[] args) {
	int age=17;
	if (age>18) {
		System.out.println("I am elegible for voting");
	} else if(age==17) {
		System.out.println("Sorry, Try next Year");
	}
		else {
			System.out.println("Not elegible for voting");
		}
	}
}

