package Assignment2;

import java.text.DecimalFormat;		
import java.util.Scanner;

public class EmployeeManagement implements Payment{		//2.1 Inheritance
	
	Scanner input = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	private int employeeNo;
	private String[] employeeName;
	private double[] employeeSalary;
	private double totalsalary;
	private String month;
	private int quantity;
	
	public EmployeeManagement(int q) {
		super();
		quantity = q;

		System.out.println("\n==========================================================" + "\n\t\tEmployee Management System");
		System.out.print("\nPlease enter the month : ");
		month = input.nextLine();
		
		System.out.print("\nPlease enter the number of employee : ");
		employeeNo = input.nextInt();
		employeeName = new String[employeeNo];
		employeeSalary = new double[employeeNo];
		
		for(int i = 0; i < employeeName.length; i++) {
			System.out.print("\nPlease enter the name of employee " + (i + 1) + " : " );
			employeeName[i] = input.next();input.nextLine();
			System.out.print("Please enter his/her salary : RM ");
			employeeSalary[i] = input.nextDouble();
		}
		
		totalsalary = calculateTotalSalary(employeeSalary);
		salaryStatement();
	}
	
	public double getPayment() {		//2.5 Interface
		return 78239;
	}
	
	public void getTotalEmployee() {
		System.out.print("\nPlease enter the number of employee : ");
		employeeNo = input.nextInt();
		employeeName = new String[employeeNo];
		employeeSalary = new double[employeeNo];
		
		for(int i = 0; i < employeeName.length; i++) {
			System.out.print("\nPlease enter the name of employee " + (i + 1) + " : " );
			employeeName[i] = input.next();input.nextLine();
			System.out.print("Please enter his/her salary : RM ");
			employeeSalary[i] = input.nextDouble();
		}
		
		totalsalary = calculateTotalSalary(employeeSalary);
	}
	
	double calculateTotalSalary(double[] employeeSalary) {
		double totalsalary = 0;
		for (int i = 0; i < employeeSalary.length; i++) {
			totalsalary += employeeSalary[i];
		}
		return totalsalary;
	}
	
	public String salaryStatement() {		
		return "\n==========================================================" +
				"\n\t\tSALARY STATEMENT FOR " + month +
				"\n==========================================================" +
				"\n\nNumber of employees : " + employeeNo +
				"\nTotal Salary : RM " + df2.format(totalsalary) +
				"\nPayment : RM " + df2.format(getPayment()) +
				"\n\n==========================================================";
	}
}
