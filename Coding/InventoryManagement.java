package Assignment1;

import java.util.Scanner;		//1.2 predefine class

public class InventoryManagement {		//1.3 User define class
	
	static Scanner input = new Scanner(System.in);
	
	private int qOri, qRented;
	protected int qAvailable;
	private String date;
	
	public InventoryManagement(int qO, int qR) {
		qOri= qO;
		qRented = qR;
		
		System.out.println("\n==========================================================" + "\n\t\tInventory Management System");
		
		System.out.print("\nPlease enter today's date : ");
		date = input.nextLine();
	}
	
	public int calculateVenueAvailable() {
		return qAvailable = qOri - qRented;
	}
	
	public String stockCount() {
		return "\n==========================================================" +
				"\n\tSTOCK COUNT STATEMENT FOR " + date +
				"\n==========================================================" +
				"\n\nNumber of venue original\t: " + qOri +
				"\nNumber of venue rent today\t: " + qRented +
				"\n\nNumber of venue available\t: " + calculateVenueAvailable() +
				"\n\n==========================================================";
	}

}
