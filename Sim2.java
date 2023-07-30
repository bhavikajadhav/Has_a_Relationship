package has_a_Relationship;

public class Sim2 {
	private String service_provider;
	private String type;
	private long contact_no;
	
	//Constructor
	public Sim2(String s, String t, long c) {
		this.service_provider = s;
		this.type = t;
		this.contact_no = c;
	}
	//public getter and setter

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
    
	public void printSim2Details() {
		System.out.println("==========Sim2 Details==========");
		System.out.println(service_provider);
		System.out.println(type);
		System.out.println(contact_no);
		System.out.println("=================================");
	}

	
	
}
