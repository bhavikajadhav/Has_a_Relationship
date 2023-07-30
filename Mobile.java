package has_a_Relationship;

public class Mobile {
	private String brand;
	private String name;
	private String color;
	private double price;
	private Sim1 sim1;
	private Sim2 sim2;
	
	//Constructor
	public Mobile(String b, String n, String c, double p) {
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

	public Sim1 getSim1() {
		return sim1;
	}

	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}

	public Sim2 getSim2() {
		return sim2;
	}

	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}
	
	
	public void printMobileDetails() {
		System.out.println("==========Mobile Details==========");
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		if(sim1 != null) {
			sim1.printSim1Details();
			}else {
				System.out.println("Details are not Available");

			}
		if(sim2 != null) {
			sim2.printSim2Details();
			}else {
				System.out.println("Details are not Available");

			}

		System.out.println("=================================");
		
	}

	
}
