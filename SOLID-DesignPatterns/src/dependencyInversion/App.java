package dependencyInversion;

public class App {

	public static void main(String[] args) {

//		//No Dependency Inversion
//		new DatabaseController();

		//With Dependency Inversion
		DatabaseController controller = new DatabaseController(new MySQLDatabase());
		controller.connect();
		controller.disconnect();
	}

}
