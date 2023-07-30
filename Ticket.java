package has_a_Relationship;

public class Ticket {
	private String movie_name;
	private int no_of_tickets;
	
	//Constructor
	public Ticket(String m,int n) {
		this.movie_name =m;
		this.no_of_tickets = n;
	}
    
	//public getter and setter
	public String getMovie_name() {
		return movie_name;
	}

	public int getNo_of_tickets() {
		return no_of_tickets;
	}

	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	
	
	public void printTicketdetails() {
		System.out.println("==========Ticket Details==============");
		System.out.println("Movie Name: "+movie_name);
		System.out.println("Ticket booked: "+no_of_tickets);
		System.out.println("=======================================");
	}
}
