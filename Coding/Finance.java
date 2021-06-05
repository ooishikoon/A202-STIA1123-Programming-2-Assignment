package Assignment1;

import java.util.Scanner;		//1.2 predefine class

public class Finance {		//1.3 User define class
			
	static Scanner input = new Scanner(System.in);		
	
	private double totalSales, totalExpenses;
	protected double finalIncome;
	private String month;
	
	public Finance(double tSales, double tExpenses) {
		totalSales = tSales;
		totalExpenses = tExpenses;
		
		System.out.println("\n==========================================================" + "\n\t\t\tFinance System");
		
		System.out.print("\nPlease enter the month : ");
		month = input.nextLine();
	}
	
	public double calculateFinalIncome() {
		return finalIncome = totalSales - totalExpenses;
	}
	
	public String monthlyStatement() {
		return "\n==========================================================" +
				"\n\tFINANCIAL STATEMENT FOR MONTH " + month +
				"\n==========================================================" +
				"\n\nTotal Sales\t: RM " + totalSales +
				"\nTotal Expenses\t: RM " + totalExpenses +
				"\n\nFinal Income\t: RM " + calculateFinalIncome() +
				"\n\n==========================================================";
		
	}
	

}
