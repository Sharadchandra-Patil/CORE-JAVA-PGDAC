package tester;

public class TestUnCheckedException {

	public static void main(String[] args) {
		int result = 23 / 3;
		System.out.println("res " + result);
		int[] data = { 10, 20, 30, 40 };
		System.out.println("array data " + data[3]);
		System.out.println("Parsed int value " + Integer.parseInt("dsf345"));// NFExc : un chked exc : javac DOES NOT
																				// force handling of the un chked excs.
		System.out.println("main continues....");
	}

}
