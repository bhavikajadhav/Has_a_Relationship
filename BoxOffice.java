package has_a_Relationship;

import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre t= new Theatre("Inbox");
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. Show Seats Availabilty");
			System.out.println("2. To Book Ticket");
			System.out.println("3. To check Ticket Details");
			System.out.println("4. To Cancel Ticket");
			System.out.println("5. Exit");
			
			int n = sc.nextInt();
			switch(n) {
			case 1: {
				int number_of_seats = t.getNo_of_seats();
				System.out.println(number_of_seats+"Seats are Available");
			}break;
			case 2: {
				System.out.println("Enter the Movie Name");
				String name =sc.next();
				System.out.println("Enter the number of Seats");
				int num = sc.nextInt();
				t.setTicket(new Ticket(name , num));
				int res = t.bookTicket();
				System.out.println("Successfully booked " + res + " ticket");
			}break;
			
			case 3: {
				System.out.println("Ticket Details");
				Ticket tk = t.getTicket();
				System.out.println(tk.getMovie_name());
				System.out.println(tk.getNo_of_tickets());
				// 0r
				System.out.println(t.getTicket().getMovie_name());
			}break;
			case 4: {
				System.out.println("Enter the number of tickets to be cancel");
				int cancel = sc.nextInt();
				t.cancelTicket(cancel);
				
			}break;
			case 5: {
				System.out.println("Case 5");
				flag = false;
			}break;
			default:
			{
				System.out.println("Wrong Input");
			}
			}
		}
	}
}
