package designPatterns.creational.factory;

public class AnimalFactory {

	public static Animal getAnimal(AnimalType type) {
		
		// PROBLEM: Here our class is coupled to many implementations
		if (type == AnimalType.CAT) {
			return new Cat();
		} else if (type == AnimalType.DOG) {
			return new Dog();
		}else if (type == AnimalType.TIGER) {
			return new Tiger();
		}else if (type == AnimalType.LION) {
			return new Lion();
		}
		
		return null;
	}
}
