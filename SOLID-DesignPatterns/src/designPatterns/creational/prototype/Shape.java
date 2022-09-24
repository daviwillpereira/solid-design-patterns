package designPatterns.creational.prototype;

public abstract class Shape {

	protected int width;
	protected int heigth;

	public Shape(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	public abstract void draw();

	public abstract Shape cloneAbstract();

}
