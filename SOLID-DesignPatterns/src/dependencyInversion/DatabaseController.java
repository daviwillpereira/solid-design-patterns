package dependencyInversion;

// The high level module
public class DatabaseController {

	// loosely coupled architecture - we program to a interface
	private Database db;

	// Tightly coupled
	// private MySQLDatabase db;

//	public DatabaseController() {
//		//tight binding when we program to a class instead of a interface
//		db = new MySQLDatabase();
//		db.connect();
//		db.disconnect();
//	}

	public DatabaseController(Database db) {
		this.db = db;
	}

	public void connect() {
		this.db.connect();
	}

	public void disconnect() {
		this.db.disconnect();
	}
}
