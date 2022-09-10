package singleResponsibility;

import java.util.Scanner;

public class InputProcessor {

	private InputProcessor() {
		throw new IllegalStateException("Utility class");
	}

	public static Pair process() {

		// ask the user of any input
		Scanner sc = new Scanner(System.in);

		// get the given values
		System.out.println("Enter the first number: ");
		String firstNumber = sc.nextLine();

		System.out.println("Enter the second number: ");
		String secondNumber = sc.nextLine();

		// container for the value pair
		Pair pair = new Pair(firstNumber, secondNumber);

		sc.close();

		return pair;
	}
}
