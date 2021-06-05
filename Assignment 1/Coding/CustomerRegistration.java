package Assignment1;

import java.util.Scanner;		//1.2 predefine class

public class CustomerRegistration {		//1.3 User define class
	
	String name, gender, birthDate, address, phoneNum;
	String username, password;
	Scanner input = new Scanner(System.in);	
	
	CustomerRegistration() {
		
		System.out.println("\n==========================================================");
		System.out.println("\nKindly please enter your details.");
		
		System.out.print("\n1. Name\t\t: ");
		name = input.next() + input.nextLine();
		System.out.print("2. Gender\t: ");
		gender = input.next() + input.nextLine();
		System.out.print("3. Birth date\t: ");
		birthDate = input.next() + input.nextLine();
		System.out.print("4. Address\t: ");
		address = input.next() + input.nextLine();
		System.out.print("5. Phone Number\t: ");
		phoneNum = input.next() + input.nextLine();
		
		createID();
		printInfo();
		confirmRegister();
		
	}
	
	public void createID() {
		System.out.print("\nPlease enter your username : ");
		username = input.next() + input.nextLine();
		System.out.print("Please enter your password : ");
		password = input.next() + input.nextLine();
	}
	
	public void printInfo() {
		System.out.println("\n==========================================================");
		System.out.println("\t\t\tDETAILS");
		System.out.printf("\nName\t\t: %s" , this.name);
		System.out.printf("\nGender\t\t: %s" , this.gender);
		System.out.printf("\nBirth Date\t: %s" , this.birthDate);
		System.out.printf("\nAddress\t\t: %s" , this.address);
		System.out.printf("\nPhone Number\t: %s" , this.phoneNum);
		System.out.println("\n==========================================================");
	}
	
	public void confirmRegister() {
		System.out.print("\nPlease check your details. \nIf correct please press 1, otherwise please press 2.");
		System.out.print("\n>>>>>>>>>> ");
		int registerOption = input.nextInt();
		
		if(registerOption == 1) {
			System.out.println("\nRegister Successfully!");
			
		}
		if(registerOption == 2) {
			System.out.println("Please register again!");
		}
	}

}
