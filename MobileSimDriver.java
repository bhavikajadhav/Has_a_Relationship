package has_a_Relationship;

public class MobileSimDriver {
	public static void main(String[] args) {
		Mobile m = new Mobile("BMW","X1","Black", 4580000.00);
		m.printMobileDetails();
		
		m.setSim1(new Sim1("Vodafone","3G",76738783));
		m.printMobileDetails();
		
		m.setSim2(new Sim2("Jio","5G",656545634));
		m.printMobileDetails();
	}
}
