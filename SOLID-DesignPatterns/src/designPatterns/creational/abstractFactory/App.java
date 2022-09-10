package designPatterns.creational.abstractFactory;

public class App {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
		factory.getCar("TOYOTA").assemble();
		
		AbstractFactory factory2 = FactoryProducer.getFactory("PETROL");
		factory.getCar("FORD").assemble();
	}
}
