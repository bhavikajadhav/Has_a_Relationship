package has_a_Relationship;

public class Car {
	private String brand;
	private String name;
	private String color;
	private double price;
	private Engine engine;
	
	//Constructor
	public Car(String b, String n,String c, double p) {
		this.brand = b;
		this.name = n;
		this.color = c;
		this.price = p;
	}

	//public getter and setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	public void printCarDetails() {
		System.out.println("===========Car==========");
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		if(engine != null) {
			engine.printEngine();
			}else {
				System.out.println("Engine not present");
			}
		
	}
}
