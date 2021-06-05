package Assignment2;

import java.util.Scanner;		//1.2 predefine class

public class WeddingRentalSystemMain {
	
	static Scanner input = new Scanner(System.in);		
	
	static int answer;
	
	public static void main(String[] args) {
		
		System.out.println("==========================================================\n");
		System.out.println("\tWELCOME TO WEDDING BY DESIGN WEDDING RENTAL");
		
		System.out.println("\n==========================================================");
		System.out.println("\t\t\tMENU");
		System.out.println("\n1 Customer");
		System.out.println("\n2 Admin");
		System.out.println("\n3 Exit");
		
		System.out.print("\n>>>>>>>>>> ");
		int menuOption = input.nextInt();
		
		if(menuOption == 1) {
			System.out.println("\n==========================================================");
			System.out.println("\t\tDESIGN WEDDING RENTAL");
			System.out.println("\nIf you already have an account please press 1."
					+ "\nIf you do not have an account please press 2.");
			System.out.print("\n>>>>>>>>>> ");
			int accOption = input.nextInt();
			
			if(accOption == 1) {
				System.out.print("\nLog In : ");
				String usernameCus = input.next();input.nextLine();
				System.out.print("Password : ");
				String passwordCus = input.nextLine(); 
				
				if(usernameCus.equals("mickey") && (passwordCus.equals("mickey123"))) {
					String cusName = "Mickey";
					System.out.println("\nLogin Successfully!");
					System.out.println("\nWelcome " + cusName);
					
					Sales s = new Sales(150, 2);
					System.out.println(s);
					System.out.println(s.receipt());
				}
				
				else {
					System.out.println("\nWrong username or password! Please try again!" + "\nThe system is exiting now...");
					System.exit(0);
				}
			}		//end accOption 1
			
			if(accOption == 2) {
				CustomerRegistration cr = new CustomerRegistration();
				System.out.println(cr);
			}		//end accOption 2
			
		} 	//end customer option
		
		else if(menuOption == 2) {
			System.out.println("\n==========================================================");
			System.out.println("\t\t\tAdmin Interface");
			
			System.out.print("Log In: ");
			String usernameAdmin = input.next();input.nextLine();
			System.out.print("Password: ");
			String passwordAdmin = input.nextLine(); 
			
			if((usernameAdmin.equals("jasley")) && (passwordAdmin.equals("wrs2000"))) {
				System.out.println("\nLog In Successful!");
				System.out.println("\n==========================================================");
				
				String adminName = "Jasley";
				System.out.println("\nName of admin log in now : " + adminName);
				String position = "Official Financial";
				System.out.println("Position\t\t : " + position); 
				
					do {
						System.out.println("\n1 Inventory \n2 Employee Management \n3 Finance \n4 Advertisement & Marketing");
						System.out.print("\nPlease choose the option you want from above : ");
						int option = input.nextInt();
						
						if(option == 1) {
							InventoryManagement i = new InventoryManagement(15,8);
							System.out.println(i.stockCount());
						}
						
						if(option == 2) {
							EmployeeManagement emp = new EmployeeManagement(5);
							System.out.println(emp.salaryStatement());
						}
						
						if(option == 3) {
							Finance f = new Finance(5, "JUNE");
							System.out.println(f.monthlyStatement());		
						}
						
						if(option == 4) {
							AdvertisementAndMarketing aa = new AdvertisementAndMarketing("Church Abc", "Church Def", "JUNE");
							System.out.println(aa);
						}
						
						if(option > 5) {
							System.out.println("\nWrong input! Please try again." + "\nThe system is exiting now...");
							System.exit(0);
						}
						
						System.out.println("\nDo you want to go to menu?");
						System.out.print("Please enter an integer or -1 to stop: ");
			     		answer = input.nextInt();
					} while(answer != -1);	//end do while
				}	// end if usernameAdmin & passwordDmin are correct
			
			else {
				System.out.println("\nWrong username or password! Please try again!" + "\nThe system is exiting now...");
				System.exit(0);
			}
		}		//end admin option
	
		else if(menuOption == 3) {
			System.out.println("\nThe system is exiting now... "
					+ "\nThanks for using our service!"
					+ "\nSee you next time!");
			System.exit(0);
		}
		
		else {
			System.out.println("Invalid input. Please enter again." + "\nThe system is exiting now..."
		+ "\n==========================================================");
			System.exit(0);
		}	//end menuOption
		
	}	// end main class

}	//end WRS
