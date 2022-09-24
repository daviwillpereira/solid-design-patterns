package designPatterns.behavioral.strategy;

public class App {

	public static void main(String[] args) {
		
		OperationManager manager = new OperationManager();
		manager.setStrategy(new Addition());
		
		// Whenever we call the Strategy interface's method, 
		// the Strategy's Operation will be updated at run-time
		manager.execute(10, 5);
		
		manager.setStrategy(new Subtraction());
		manager.execute(10, 5);
		
		manager.setStrategy(new Multiplication());
		manager.execute(10, 5);
		
		//New Operation Added to the Strategy without changing the actual code
		manager.setStrategy(new Division());
		manager.execute(10, 5);
	}

}
