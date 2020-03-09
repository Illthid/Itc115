/*
 * Ticket.java
 * This program generates different types of tickets 
 * to a campus event. 
 * Each ticket has a unique number and a price.
 * 
 *David Barnette
 */

public abstract class Ticket {
	// declare variables
	private int number;
	protected double price;

	public Ticket(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Number: " + number + " Price: " + price;
	}
}
