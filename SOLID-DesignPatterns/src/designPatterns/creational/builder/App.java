package designPatterns.creational.builder;

public class App {

	/*
	 * WHY TO PREFER BUILDER PATTERN?
	 * 
	 * - There would be lots of parameters in the constructor - hard to follow
	 * 		Hard not to confuse parameters !!!
	 * 			~ setters are the same, not the best solution
	 * 
	 * - Not Extensible: When we have to add one more optional parameters, 
	 * 					 we have to create a new constructor
	 * 		Telescoping constructors appear !!!
	 * 			~ With a builder --> we just add another method
	 *  
	 * - Immutable Property: We should consider parallel execution
	 * 		The best is to use objects that can not be modified after they
	 * 		have been created - "Immutable Objects"
	 * 			~ So there will not be any problems because of concurrent 
	 * 			  updates by multiple threads
	 */
	
	public static void main(String[] args) {
		Person person = new Person.Builder("Davi", "davi@gmail.com")
				.setAddress("LOL Street")
				.setUniversity("UniBR")
				.setAge(15)
				.build();

		System.out.println(person);
	}
}
