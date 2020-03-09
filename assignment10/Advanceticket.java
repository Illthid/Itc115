/*
 * AdvanceTicket.java
 * 
 * Advance tickets purchased 10 or more days before
 * the event cost $30, and advance ticket purchased
 * fewer than 10 days before the event cost $40.
 * 
 * David Barnette
 */

public class AdvanceTicket extends Ticket {
	public AdvanceTicket(int number, int before) {
		super(number);
		// fewer than 10 days before, costs $40
		if (before < 10) {
			price = 40;
		} else {
			price = 30;
		}
	}

}
