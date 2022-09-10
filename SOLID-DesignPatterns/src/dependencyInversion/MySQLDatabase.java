package dependencyInversion;

//low level module
public class MySQLDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL Database...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting to MySQL Database...");
	}
}
