package designPatterns.creational.singleton;

public class App {

	public static void main(String[] args) {
		
		//eager version and lazy version getInstance()
		//DatabaseConnector.getInstance().connect();
		
		//Checking if its the same instance
		
//		DatabaseConnector o1 = DatabaseConnector.getInstance();
//		DatabaseConnector o2 = DatabaseConnector.getInstance();
//		
//		if (o1==o2)
//			System.out.println("The objects are the same...");
		
		Database o1 = Database.INSTANCE;
		Database o2 = Database.INSTANCE;
		
		if (o1==o2)
			System.out.println("The objects are the same...");
	}

}
