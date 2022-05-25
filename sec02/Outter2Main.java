package ch09_nested.sec02;

public class Outter2Main {

	public static void main(String[] args) {
		Outter2 outter = new Outter2();
		Outter2.Nested nested = outter.new Nested();
		nested.print();

	}

}
