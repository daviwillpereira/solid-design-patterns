package designPatterns.creational.singleton;

public class DatabaseConnector {

//	//eager version
//	private static DatabaseConnector INSTANCE = new DatabaseConnector();
	
	//lazy version
	private static DatabaseConnector INSTANCE;
	
	//we aren't able to instantiate the class (private Constructor)
	//vulnerable to reflection attacks - Using reflections hackers can allow multiple instantiation
 	private DatabaseConnector() {
		
	}
	
	//eager version getInstance()
//	public static DatabaseConnector getInstance() {
//		return INSTANCE;
//	}
	
	//lazy version getInstance() - we just instantiate the class if necessary
	public static DatabaseConnector getInstance() {
		// IF WE HAVE MULTIPLE THREADS???
		if(INSTANCE == null) {
			//this block can be entered by single thread
			// PROBLEM: synchronized blocks are too slow (100x)
			synchronized (DatabaseConnector.class) {
				INSTANCE = new DatabaseConnector();
			}
		}
		
		return INSTANCE;
	}
	
	public void connect() {
		System.out.println("Connection to the db...");
	}

	public void disconnect() {
		System.out.println("Disconnection to the db...");
	}
}
