package designPatterns.creational.prototype;

public class Square extends Shape{

	
	public Square(int width, int heigth) {
		super(width, heigth);
	}

	@Override
	public void draw() {
		System.out.println("Square with width: " + width + " heigth: "+ heigth);
	}

	@Override
	public Shape cloneAbstract() {
		// This is the Prototype Pattern
		return new Square(width, heigth);
	}

}
