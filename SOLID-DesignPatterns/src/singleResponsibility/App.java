package singleResponsibility;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to the application!");
		
		// we can get the values
		Pair pair = InputProcessor.process();
		
		//Check whether the inputs are fine or not
		if (!ViolationChecker.isValid(pair)) {
			System.out.println("One of the inputs is invalid...");
		}
		
		int firstInteger = Integer.valueOf(pair.getFirst());
		int secondInteger = Integer.valueOf(pair.getSecond());
		
		//Do the Math operation
		int result = Operation.execute(firstInteger, secondInteger);
		
		System.out.println("The result is : " + result);
	}
}
