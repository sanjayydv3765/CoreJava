package oops;

public class OverloadingExample {
	public int GetArea(int l, int b) {
		return l * b;
	}

	public int GetArea(int l) {
		return l * l;
	}

	public Float GetArea(float l) {
		return l * l;
	}
}
