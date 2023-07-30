package has_a_Relationship;

public class Theatre {
	private String theatre_name;
	private int no_of_seats = 500;
	private Ticket ticket;
	
	//Constructor
	public Theatre(String n) {
		this.theatre_name = n;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	//code for theatre operation
	
	public int bookTicket() {
		if(ticket.getNo_of_tickets() <= no_of_seats) {
			no_of_seats = no_of_seats - ticket.getNo_of_tickets();
			return ticket.getNo_of_tickets();
		}else {
			return -1;
		}
	}
	
	
	public int showSeatsAvailabilty() {
		return no_of_seats;
	}
	
	
	public void cancelTicket(int cancel_ticket) {
		if(cancel_ticket <= ticket.getNo_of_tickets()) {
			no_of_seats = no_of_seats + cancel_ticket;
			ticket.setNo_of_tickets(ticket.getNo_of_tickets() - cancel_ticket);
		}else
		{
			System.out.println("============Technical Issue===============");
		}
	}
	
	public void showTicketdetails() {
		ticket.printTicketdetails();
	}
}
