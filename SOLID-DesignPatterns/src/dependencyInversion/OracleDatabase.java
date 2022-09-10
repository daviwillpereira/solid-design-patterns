package dependencyInversion;

//Another low level module
public class OracleDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle Database...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting to Oracle Database...");
	}
}
