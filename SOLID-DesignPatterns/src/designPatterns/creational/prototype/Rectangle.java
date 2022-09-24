package designPatterns.creational.prototype;

public class Rectangle extends Shape{

	
	public Rectangle(int width, int heigth) {
		super(width, heigth);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle with width: " + width + " heigth: "+ heigth);
	}

	@Override
	public Shape cloneAbstract() {
		// This is the Prototype Pattern
		return new Rectangle(width, heigth);
	}

}
