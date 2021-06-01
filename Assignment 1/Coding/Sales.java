package Assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sales {
	
	static Scanner input = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	double price, totalPrice, balance, pt;
	int capacity, dayToRent;
	String name, date, location, paymentMethod;
	
	public Sales(double p, int d) {
		price = p;
		dayToRent = d;
		
		System.out.print("Please enter your name : ");
		name = input.nextLine();
		System.out.print("Please enter the date you want : ");
		date = input.nextLine();
		
		System.out.println("\nThere are few locations are available currently for " + date
				+ "\nYou may choose from the locations below.\n"
				+ "\nBukit Mertajam" + "\nButterworth" + "\nSimpang Ampat" + "\nPenang");
		System.out.print("\nYour choice : ");
		location = input.nextLine();
		
		System.out.print("\nPlease enter the estimate people you would like to invite : ");
		capacity = input.nextInt();
		
		System.out.print("Please enter the number of day you want to rent : ");
		dayToRent = input.nextInt();
		
		if(capacity < 50) {
			System.out.println("\nGreat! We will provide you the suitable place at " + location + " for " + dayToRent + " days");
			System.out.println("The price to rent per day which is RM " + price);
			System.out.println("Total price rent for " + dayToRent + " days is RM " + df2.format(calculateTotalPrice()));
		}
		
		else if(capacity > 50 && capacity < 100) {
			double p2 = 250;
			price = p2;
			System.out.println("\nGreat! We will provide you the suitable place at " + location + " for " + dayToRent + " days");
			System.out.println("The price to rent per day which is RM " + p2);
			System.out.println("Total price rent for " + dayToRent + " days is RM " + df2.format(calculateTotalPrice(p2)));
		}
		else if(capacity > 100) {
			double p3 = 350;
			price = p3;
			System.out.println("\nGreat! We will provide you the suitable place at " + location + " for " + dayToRent + " days");
			System.out.println("The price to rent per day which is RM " + p3);
			System.out.println("Total price rent for " + dayToRent + " days is RM " + df2.format(calculateTotalPrice(p3,d)));
		}
		else {
			System.out.println("Invalid input. Please enter again.");
		}		//end if else capacity	
		
		System.out.print("\nPlease enter your payment : RM ");
		pt = input.nextDouble();
	}	//end Sales

	
	public double calculateTotalPrice() {	//constructor with no argument
		return totalPrice = price * dayToRent;
	}
	
	public double calculateTotalPrice(double p2) {	//constructor with one argument
		return totalPrice = p2 * dayToRent;
	}
	
	public double calculateTotalPrice(double p3, int d) {	//constructor with two argument
		return totalPrice = p3 * d;
	}
	
	public double calBalance() {
		return balance = pt - totalPrice;
	}
	
	public String receipt() {
		return "\n==========================================================" +
				"\n\t\t\tRECEIPT" +
				"\n==========================================================" +
				"\n\nBooking Person\t\t: " + name +
				"\nDate\t\t\t: " + date +
				"\nPeople capacity\t\t: " + capacity +
				"\nLocation\t\t: " + location +
				"\nPrice per day\t\t: RM " + price +
				"\nDays to rent\t\t: " + dayToRent + " days" +
				"\nTotal Price\t\t: RM " + totalPrice +
				"\nPayment\t\t\t: RM " + pt +
				"\nBalance\t\t\t: RM " + calBalance() +
				"\n\n==========================================================" +
				"\n\t\t\tTHANK YOU" +
				"\n==========================================================" ;	
	}
	

}
