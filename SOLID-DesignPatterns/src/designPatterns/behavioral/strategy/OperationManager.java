package designPatterns.behavioral.strategy;

// Abstract Layer between the High Level Modules and the Low Level Modules
public class OperationManager {

	//Favoring Composition over Inheritance to give more flexibility
	// BECAUSE the BEHAVIOR can be changed at run-time
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(int num1, int num2) {
		this.strategy.execute(num1, num2);
	}
}
