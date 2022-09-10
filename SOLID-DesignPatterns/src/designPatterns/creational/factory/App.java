package designPatterns.creational.factory;

public class App {

	public static void main(String[] args) {
		AnimalFactory.getAnimal(AnimalType.CAT).eat();
		AnimalFactory.getAnimal(AnimalType.DOG).eat();
		AnimalFactory.getAnimal(AnimalType.TIGER).eat();
		AnimalFactory.getAnimal(AnimalType.LION).eat();
	}

}
