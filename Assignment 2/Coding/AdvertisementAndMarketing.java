package Assignment2;

import java.util.Scanner;		
import java.text.DecimalFormat;

public class AdvertisementAndMarketing extends CompanyDescription {		//2.1 Inheritance
	
	static Scanner input = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	String bestVenue, worstVenue;
	int qbVenue, qwVenue;
	String month;
	double totalIncome, totalProfit;
	
	public AdvertisementAndMarketing(String bVenue, String wVenue, String m) {
		super();
		bestVenue = bVenue;
		worstVenue = wVenue;
		month = m;
		
		System.out.print("\nPlease enter the month : ");
		month = input.nextLine();
		
		System.out.print("Please enter the number of best rental venue rented this month : ");
		qbVenue = input.nextInt();
		System.out.print("Please enter the number of worst rental venue rented this month : ");
		qwVenue = input.nextInt();
		
		System.out.print("Please enter total income this month : RM ");
		totalIncome = input.nextDouble();
	}
	
	//2.3 Encapsulation - Setter methods
	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}
		
	//2.3 Encapsulation - Getter methods
	public double getTotalIncome() {
		return this.totalIncome;
	}
	
	public float rateOfProfit() {
		return 0.15f;
	}
	
	public double calculateTotalProfit() {
		setTotalIncome(92394);
		return totalProfit = totalIncome * rateOfProfit();
	}
	
	public String rentalReport() {
		return "\n=========================================================" +
				"\n\t\tRENTAL REPORT FOR month " + month +
				"\n=========================================================" +
				"\n\nBest rental venue\t: " + bestVenue +
				"\nNumber of rented\t: " + qbVenue +
				"\nWorst rental venue\t: " + worstVenue +
				"\nNumber of rented\t: " + qwVenue +
				"\n\n=========================================================";
	}
	
	public String profitReport() {
		return "\n=========================================================" +
				"\n\t\tPROFIT REPORT FOR month " + month +
				"\n=========================================================" +
				"\n\nTotal Income\t: RM " + totalIncome +
				"\nRate of profit\t: " + rateOfProfit() +
				"\n\nTotal Profit\t: RM " + df2.format(calculateTotalProfit()) +
				"\n\n=========================================================";
	}

	public String toString() {
		return "\n\t\t\tREPORT" +
				rentalReport() + profitReport();
		
	}

	public void printInfo() {		//2.2 Polymorphism
		toString();
		rentalReport();
		profitReport();
	}
}
