/*
 * TicketTest.java
 * Main method to test classes.
 * 
 *David Barnette
 */
import java.util.*;

public class TicketTest {

	public static void main(String[] args) {
		int choice;
		System.out.println("Please choose one of the following types:\n" + "1. Walkup Ticket\n" + "2. Advance Ticket\n");
		System.out.print("Choice: ");

		Scanner input = new Scanner(System.in);
		choice = input.nextInt();

		// print tickets
		if (choice == 1) {
			int num = (int) (Math.random() * 99);
			Ticket wt = new WalkupTicket(num);
			System.out.println(wt);
		}
		
		if (choice == 2) {
			int num = (int) (Math.random() * 99);
			//10 or more days before 
			Ticket at = new AdvanceTicket(num,11);
			System.out.println(at);
		}
		
		input.close();
	}

}
