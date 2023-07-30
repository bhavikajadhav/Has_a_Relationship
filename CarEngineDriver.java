package has_a_Relationship;

public class CarEngineDriver {
	public static void main(String[] args) {
		Car c = new Car("BMW","X1","Black",650000);
		c.printCarDetails();
		
		c.setEngine(new Engine("M5","2500cc"));
		c.printCarDetails();
	}
}
