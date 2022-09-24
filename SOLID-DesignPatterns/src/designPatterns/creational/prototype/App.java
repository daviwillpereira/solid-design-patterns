package designPatterns.creational.prototype;

public class App {

	public static void main(String[] args) {

		Shape square = new Square(10, 5);
		square.draw();

		// Calling the Prototype Pattern
		Shape squareClone = square.cloneAbstract();
		squareClone.draw();

	}

}
