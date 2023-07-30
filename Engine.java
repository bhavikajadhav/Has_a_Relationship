package has_a_Relationship;

public class Engine {
	private String brand;
	private String cubic_capacity;
	
	//Constructor
	public Engine(String b,String cc) {
		this.brand = b;
		this.cubic_capacity = cc;
	}
	
    //public getter and setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCubic_capacity() {
		return cubic_capacity;
	}

	public void setCubic_capacity(String cubic_capacity) {
		this.cubic_capacity = cubic_capacity;
	}
	
	public void printEngine() {
		System.out.println("==========Engine==========");
		System.out.println(brand);
		System.out.println(cubic_capacity);
		System.out.println("============================");
	}
	
}
