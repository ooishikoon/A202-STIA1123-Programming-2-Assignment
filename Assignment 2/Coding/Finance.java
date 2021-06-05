package Assignment2;

import java.text.DecimalFormat;
import java.util.Scanner;		

public class Finance extends EmployeeManagement implements Payment {		//2.1 Inheritance 
																			//2.5 Interface
			
	static Scanner input = new Scanner(System.in);	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	private double totalIncome, totalExpenses;
	protected double finalIncome;
	double incomeInvestment, incomeRental;
	double maintainance, advertisement, wagesEmployee;
	private String month;
	
	public Finance(int q, String m) {
		super(q);
		this.month = m;
		
		System.out.println("\n==========================================================" + "\n\t\t\tFinance System");
		
		printInfo();
	}
	
	//2.3 Encapsulation - Setter methods
	public void setIncomeRental(double incomeRental) {
		this.incomeRental = incomeRental;
	}
		
	public void setIncomeInvestment(double incomeInvestment) {
		this.incomeInvestment = incomeInvestment;
	}
	
	public void setMaintainance(double maintainance) {
		this.maintainance = maintainance;
	}
		
	public void setAdvertisement(double advertisement) {
		this.advertisement = advertisement;
	}
		
	public void setWagesEmployee(double wagesEmployee) {
		this.wagesEmployee = wagesEmployee;
	}
		
	//2.3 Encapsulation - Getter methods
	public double getIncomeRental() {
		return this.incomeRental;
	}
		
	public double getIncomeInvestment() {
		return this.incomeInvestment;
	}
	
	public double getMaintainance() {
		return this.maintainance;
	}
		
	public double getAdvertisement() {
		return this.advertisement;
	}
		
	public double getWagesEmployee() {
		return this.wagesEmployee;
	}
	
	public double getPayment() { 	//2.5 Interface
		return 8294;
	}
	
	public void calculateTotalIncome() {
		setIncomeRental(53291.23);
		setIncomeInvestment(getPayment());

		totalIncome = incomeRental + incomeInvestment;
		
		System.out.println("\n=======================TOTAL INCOME=======================");
		System.out.println("\nIncome from Rental\t\t: RM " + df2.format(getIncomeRental()));
		System.out.println("\nIncome from Investment\t\t: RM " + df2.format(getIncomeInvestment()));
		
		System.out.println("\nThe total income in " + month + " is RM " + df2.format(totalIncome));
	}
	
	public void calculateTotalExpenses() {
		setMaintainance(8500);
		setAdvertisement(2350);
		setWagesEmployee(18930);
		
		totalExpenses = wagesEmployee + maintainance + advertisement;
		
		System.out.println("\n\n=======================TOTAL EXPENSES=======================");
		System.out.println("\nMaintainance Expenses\t: RM " + df2.format(getMaintainance()));
		System.out.println("\nAdvertisement Expenses\t: RM " + df2.format(getMaintainance()));
		System.out.println("\nWages Employee\t\t: RM " + df2.format(getWagesEmployee()));
		
		System.out.println("\nThe total expenses in " + month + " is RM "+ df2.format(totalExpenses));
	}
	
	public double calculateFinalIncome() {
		return finalIncome = totalIncome - totalExpenses;
	}
	
	public String monthlyStatement() {		
		return "\n==========================================================" +
				"\n\tFINANCIAL STATEMENT FOR MONTH " + month +
				"\n==========================================================" +
				"\n\nTotal Sales\t: RM " + totalIncome +
				"\nTotal Expenses\t: RM " + totalExpenses +
				"\n\nFinal Income\t: RM " + df2.format(calculateFinalIncome()) +
				"\n\n==========================================================";
	}

	public void printInfo() {		//2.2 Polymorphism
		calculateTotalIncome();
		calculateTotalExpenses();
		monthlyStatement();
		
	}

}
