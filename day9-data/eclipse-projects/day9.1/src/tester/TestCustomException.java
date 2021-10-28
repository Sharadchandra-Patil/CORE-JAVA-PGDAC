package tester;

import static utils.SpeedUtils.validateSpeed;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the speed");
			//Tester has to invoke SpeedUtils' method for validation
			validateSpeed(sc.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
