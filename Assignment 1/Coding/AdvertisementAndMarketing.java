package Assignment1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AdvertisementAndMarketing {
	
	static Scanner input = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	String bestVenue, worstVenue;
	int qbVenue, qwVenue;
	String month;
	double totalIncome, totalProfit;
	
	public AdvertisementAndMarketing(String bVenue, String wVenue) {
		bestVenue = bVenue;
		worstVenue = wVenue;
		
		System.out.print("\nPlease enter the month : ");
		month = input.nextLine();
		 
		System.out.print("Please enter the number of best rental venue rented this month : ");
		qbVenue = input.nextInt();
		System.out.print("Please enter the number of worst rental venue rented this month : ");
		qwVenue = input.nextInt();
		
		System.out.print("Please enter total income this month : RM ");
		totalIncome = input.nextDouble();
	}
	
	public float rateOfProfit() {
		return 0.15f;
	}
	
	public double calculateTotalProfit() {
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
}
