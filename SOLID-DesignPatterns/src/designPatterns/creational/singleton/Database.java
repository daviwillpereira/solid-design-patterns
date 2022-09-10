package designPatterns.creational.singleton;

//This is good because Enums are Compile time constants - 
public enum Database {

	// guarantees that acquiring this INSTANCE is thread-safe
	INSTANCE;

	public void connect() {
		System.out.println("Connection to the db...");
	}

	public void disconnect() {
		System.out.println("Disconnection to the db...");
	}
}
