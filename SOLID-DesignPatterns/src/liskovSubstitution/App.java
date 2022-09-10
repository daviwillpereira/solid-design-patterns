package liskovSubstitution;

public class App {
	//
	public static void main(String[] args) {
		
		//design smell - Actual design is not the best as possible as the LP was broken
		Vehicle v = new PetrolCar("Ford", 6);
		v.speedUp();
		v.slowDown();
		v.fuel();
	}
}
